import java.nio.ByteBuffer;

public class Animation {
	
	// animate text as if it's being typed by a typewriter
	void typewrite(String sentence) throws InterruptedException {
		ByteBuffer charBytes = ByteBuffer.allocate(sentence.length());
		byte [] charSentence = sentence.getBytes();
		charBytes.put(charSentence);
		for (int i = 0; i < charSentence.length; i++) {
			System.out.print(charBuff.get());
			Thread.sleep(35);
		}
	}
	
	void typewrite(String sentence, String name) throws InterruptedException {
		ByteBuffer charBuff = ByteBuffer.allocate(sentence.length());
		ByteBuffer uniqueBuff = ByteBuffer.allocate(name.length());
		byte [] charSentence = sentence.getBytes();
		byte [] uniqueArg = name.getBytes();
		// find a way to use arguements in typewrite fashion
		charBuff.put(charSentence);
		
	}
}