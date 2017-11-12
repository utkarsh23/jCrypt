package cryptography;

public class Substitution implements CipherType {
	public String getCipherType() {
		return "Substitution Cipher";
	}

	public void cipherImplementations(Integer number) {
		if (number == 1)
			System.out.println("Caesar Cipher");
		else if (number == 2)
			System.out.println("MonoAlpabetic Cipher");
	}
}