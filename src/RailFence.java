package cryptography;

public class RailFence extends Transposition implements Cipher{
	public String encrypt(String plaintext) {
		String returnString = "";
		for (int a = 0; a < plaintext.length(); a += 2) {
			returnString += plaintext.charAt(a);
		}
		returnString += "\t";
		for (int a = 1; a < plaintext.length(); a += 2) {
			returnString += plaintext.charAt(a);
		}
		return returnString;
	}

	public String decrypt(String ciphertext) {
		String[] parts = ciphertext.split("\t");
		String first = parts[0];
		String second = parts[1];
		int index_1 = 0;
		int index_2 = 0;
		String returnString = "";
		while (true) {
			returnString += first.charAt(index_1);
			index_1++;
			if (index_1 >= first.length()) {
				return (returnString + second.substring(index_2, second.length()));
			}
			returnString += second.charAt(index_2);
			index_2++;
			if (index_2 >= second.length()) {
				return (returnString + first.substring(index_1, first.length()));
			}
		}
	}
}