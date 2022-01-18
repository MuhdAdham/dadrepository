package exercise3;

public class arrayOverloadApp {

	public static void main(String[] args) {
		
		Runnable statement = new arrayData();
		Thread statementThread = new Thread(statement);
		statementThread.setName("word1");
	
		statementThread.start();


	}

}