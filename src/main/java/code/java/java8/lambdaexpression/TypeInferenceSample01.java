package code.java.java8.lambdaexpression;

public class TypeInferenceSample01 {

	public static void main(String[] args) {
		StringLengthLambda stringLengthLambda = s -> s.length();
		System.out.println(stringLengthLambda.getLen("welcome lambda"));

	}

	interface StringLengthLambda {
		int getLen(String s);
	}
}
