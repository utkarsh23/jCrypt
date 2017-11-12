package cryptography;

import java.util.*;

public class MonoAlphabetic extends Substitution implements Cipher {
	HashMap<Integer,Integer> alphamap;

	public MonoAlphabetic() {
		mapLetters();
	}

	public String encrypt(String plaintext) {
		return process(plaintext, "encrypt");
	}

	public String decrypt(String ciphertext) {
		return process(ciphertext, "decrypt");
	}

	public void mapLetters() {
		alphamap = new HashMap<>();
		ArrayList<Integer> letters = new ArrayList<>();
		for (int a = 0; a <= 25; a++) {
			letters.add(a);
		}
		Collections.shuffle(letters);
		ArrayList<Integer> first = new ArrayList<>(letters.subList(0, 13));
		ArrayList<Integer> second = new ArrayList<>(letters.subList(13,26));
		Integer select, index;
		for (Integer b = 0; b <= 12; b++) {
			alphamap.put(first.get(b), second.get(b));
			alphamap.put(second.get(b), first.get(b));
		}
	}

	public void printMappedLetters() {
		int one, two;
		for (Map.Entry<Integer,Integer> pair : alphamap.entrySet()) {
			one = (int) pair.getKey() + 97;
			two = (int) pair.getValue() + 97;
			System.out.println((char) one + " : " + (char) two);
		}
	}

	public String process(String string, String mode) {
        String returnString = "";
        int character;
        for (int a = 0; a < string.length(); a++) {
            character = (int) string.charAt(a);
            if ((character >= 97) && (character <= 122)) {
                character = alphamap.get(character - 97);
                character += 97;
            }
            else if ((character >= 65) && (character <= 90)) {
                character = alphamap.get(character - 65);
                character += 65;
            }
            returnString += (char) character;
        }
        return returnString;
    }
}