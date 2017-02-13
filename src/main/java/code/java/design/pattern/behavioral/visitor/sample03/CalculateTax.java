package code.java.design.pattern.behavioral.visitor.sample03;

public class CalculateTax {

	public static void main(String[] args) {
		Grocessary grocessary = new Grocessary(10);
		Sprit sprit = new Sprit(15);
		Necessity necessity = new Necessity(5);
		
		TaxVisitor taxVisitorGradeA = new TaxVisitorGradeA();
		TaxVisitor taxVisitorGradeB = new TaxVisitorGradeB();
		
		System.out.println(grocessary.accept(taxVisitorGradeA));
		System.out.println(sprit.accept(taxVisitorGradeA));
		System.out.println(necessity.accept(taxVisitorGradeA));

		
		System.out.println(grocessary.accept(taxVisitorGradeB));
		System.out.println(sprit.accept(taxVisitorGradeB));
		System.out.println(necessity.accept(taxVisitorGradeB));
	}

}
