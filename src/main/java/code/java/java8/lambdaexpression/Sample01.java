package code.java.java8.lambdaexpression;

public class Sample01 {

	public static void main(String[] args) {
		Sample01 tester = new Sample01();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
			
	      //with parenthesis
	      GreetingService greetService1 = message -> System.out.println("Hello " + message);
			
	      //without parenthesis
	      GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	   }
		
	   interface GreetingService {
		      void sayMessage(String message);
	   }
	   
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	}