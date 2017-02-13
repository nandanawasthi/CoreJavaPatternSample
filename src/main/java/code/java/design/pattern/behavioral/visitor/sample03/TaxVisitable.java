package code.java.design.pattern.behavioral.visitor.sample03;

public interface TaxVisitable {

	public double accept(TaxVisitor taxVisitor);
	public double getPrice();
}
