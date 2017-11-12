package cryptography;

public class Caesar extends Substitution implements Cipher {
    Integer key;

    public Caesar(Integer key) {
        this.key = key;
    } 

    public String encrypt(String plaintext) {
        return process(plaintext, "encrypt");
    }

    public String decrypt(String ciphertext) {
        return process(ciphertext, "decrypt");
    }

    public String process(String string, String mode) {
        int cipherkey = key;
        if (mode == "decrypt") {
            cipherkey = NO_OF_ALPHABETS - key;
        }
        String returnString = "";
        int character;
        for (int a = 0; a < string.length(); a++) {
            character = (int) string.charAt(a);
            if ((character >= 97) && (character <= 122)) {
                character -= 'a';
                character += cipherkey;
                character %= NO_OF_ALPHABETS;
                character += 'a';
            }
            else if ((character >= 65) && (character <= 90)) {
                character -= 'A';
                character += cipherkey;
                character %= NO_OF_ALPHABETS;
                character += 'A';
            }
            returnString += (char) character;
        }
        return returnString;
    }
}