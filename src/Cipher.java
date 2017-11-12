package cryptography;

public interface Cipher {
	Integer NO_OF_ALPHABETS = 26;
	String encrypt(String plaintext);
	String decrypt(String ciphertext);
}