import java.util.Scanner;

public class View {

		private Scanner scnr; 
		
		public View() {
			scnr = new Scanner(System.in);
		}
		
		public String getter() {
			return scnr.nextLine();
		}
}
