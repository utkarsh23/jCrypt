import cryptography.*;

public class Implementation {
	String testString = "I am hurt badly HELP";
	public static void main(String[] args) {
		Implementation implementation = new Implementation();
		implementation.caesarDemo();
		implementation.monoAlphabeticDemo();
		implementation.railFenceDemo();
		implementation.scytaleDemo();
	}

	public void caesarDemo() {
		Integer shift = 2;
		Caesar caesar = new Caesar(shift);
		System.out.println("--------------------");
		caesar.cipherImplementations(1);
		System.out.println("--------------------");
		System.out.println("Plaintext: \"" + testString + "\"");
		System.out.println("Shift: " + Integer.toString(shift));
		System.out.println("Encrypted: \"" + caesar.encrypt(testString) + "\"");
	}

	public void monoAlphabeticDemo() {
		MonoAlphabetic monoAlphabetic = new MonoAlphabetic();
		System.out.println("--------------------");
		monoAlphabetic.cipherImplementations(2);
		System.out.println("--------------------");
		monoAlphabetic.printMappedLetters();
		System.out.println("Plaintext: \"" + testString + "\"");
		System.out.println("Encrypted: \"" + monoAlphabetic.encrypt(testString) + "\"");
		System.out.println("Decrypted: \"" + monoAlphabetic.decrypt(monoAlphabetic.encrypt(testString)) + "\"");
	}

	public void railFenceDemo() {
		RailFence railFence = new RailFence();
		System.out.println("--------------------");
		railFence.cipherImplementations(1);
		System.out.println("--------------------");
		System.out.println("Plaintext: \"" + testString + "\"");
		System.out.println("Encrypted: \"" + railFence.encrypt(testString) + "\"");
		System.out.println("Decrypted: \"" + railFence.decrypt(railFence.encrypt(testString)) + "\"");
	}

	public void scytaleDemo() {
		Scytale scytale = new Scytale(4,5);
		System.out.println("--------------------");
		scytale.cipherImplementations(2);
		System.out.println("--------------------");
		System.out.println("Plaintext: \"" + testString + "\"");
		System.out.println("Encrypted: \"" + scytale.encrypt(testString) + "\"");
		System.out.println("Decrypted: \"" + scytale.decrypt(scytale.encrypt(testString)) + "\"");
		System.out.println("--------------------");
	}
}