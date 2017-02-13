package code.java.java8.lambdaexpression;

public class TypeInferenceSample02 {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLen("Hello Lambda"));
	}

	interface StringLengthLambda {
		int getLen(String s);
	}
}
