package code.core.java.pattern.behavioral.visitor.sample03;

public interface TaxVisitor {

	public double visit(Grocessary grocessary);
	public double visit(Sprit sprit);
	public double visit(Necessity necessity);
}
