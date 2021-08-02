
public class FinancePrompts {
	
	private Animation typer;
	
	public FinancePrompts() {
		 typer = new Animation();
	}
	
	void welcomePrompt() throws InterruptedException{
		// need to call instance method from View
		typer.typewrite("Welcome to your personal financer");
		Thread.sleep(800);
		typer.typewrite("\n--------------------"
				+ "--------------------\n");
	}
	
	void getName() throws InterruptedException{
		typer.typewrite("Please enter your name: ");
	}
	
	void getLName() throws InterruptedException {
		typer.typewrite("Please enter you last name: ");
	}
	
	void getJobs() throws InterruptedException{
		typer.typewrite("So your name's ");
	}
}
