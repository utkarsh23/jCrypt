package cryptography;

import java.lang.*;

public class Scytale extends Transposition implements Cipher {
	Integer size_l;
	Integer size_w;
	Character[][] array;

	public Scytale(Integer first, Integer second) {
		this.size_l = first;
		this.size_w = second;
	}
	public String encrypt(String plaintext) {
		String returnString = "";
		Integer index = 0;
		array = new Character[size_w][size_l];
		for (int a = 0; a < size_l; a++) {
			for (int b = 0; b < size_w; b++) {
				if (index < plaintext.length()) {
					try {
						array[b][a] = plaintext.charAt(index);
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Error! Index out of bound.");
					}
					index++;
				}
				else {
					try {
						array[b][a] = null;
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Error! Index out of bound.");
					}
				}
			}
		}
		for (int c = 0; c < size_w; c++) {
			for (int d = 0; d < size_l; d++) {
				returnString += array[c][d];
			}
		}
		return returnString;
	}

	public String decrypt(String ciphertext) {
		String returnString = "";
		Integer index = 0;
		for (int c = 0; c < size_l; c++) {
			for (int d = 0; d < size_w; d++) {
				returnString += array[d][c];
			}
		}
		return returnString;
	}
}