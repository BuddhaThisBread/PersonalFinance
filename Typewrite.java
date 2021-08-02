import java.util.Scanner;

public class Typewrite {
	private Scanner scnr;
	
	public Typewrite() {
		scnr = new Scanner(System.in);
	}
	
	void sleepConverter(String convert) throws InterruptedException{
		char [] array = convert.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			Thread.sleep(35);
		}
		Thread.sleep(100);
	}
	
	void read() {
		scnr.nextLine();
	}
	
}
