package code.java.java8.lambdaexpression;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("lambda is not yet implemented here");
			}
		});
		myThread.start();
		Thread myLambdaThread = new Thread(() -> System.out.println("Lambda has been implemented in runnbale"));
		myLambdaThread.start();
		
	}

}
