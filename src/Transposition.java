package cryptography;

public class Transposition implements CipherType {
	public String getCipherType() {
		return "Transposition Cipher";
	}

	public void cipherImplementations(Integer number) {
		if (number == 1)
			System.out.println("Rail Fence Cipher");
		else if (number == 2)
			System.out.println("Row Transposition Cipher");
	}
}