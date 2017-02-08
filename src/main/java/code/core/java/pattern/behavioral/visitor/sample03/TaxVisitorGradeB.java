package code.core.java.pattern.behavioral.visitor.sample03;

public class TaxVisitorGradeB implements TaxVisitor {

	public double visit(Grocessary grocessary) {
		return ((grocessary.getPrice() * .25) + grocessary.getPrice());
	}

	public double visit(Sprit sprit) {
		return ((sprit.getPrice() * .20) + sprit.getPrice());
	}

	public double visit(Necessity necessity) {
		return ((necessity.getPrice() * .30) + necessity.getPrice());
	}

}
