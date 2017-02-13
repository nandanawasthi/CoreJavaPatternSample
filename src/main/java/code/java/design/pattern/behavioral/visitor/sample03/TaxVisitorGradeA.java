package code.java.design.pattern.behavioral.visitor.sample03;

public class TaxVisitorGradeA implements TaxVisitor {

	public double visit(Grocessary grocessary) {
		return ((grocessary.getPrice() * .15) + grocessary.getPrice());
	}

	public double visit(Sprit sprit) {
		return ((sprit.getPrice() * .10) + sprit.getPrice());
	}

	public double visit(Necessity necessity) {
		return ((necessity.getPrice() * .20) + necessity.getPrice());
	}

}
