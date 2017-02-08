package code.core.java.pattern.behavioral.visitor.sample03;

public class Necessity implements TaxVisitable {

	double price;
	
	public Necessity(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double accept(TaxVisitor taxVisitor) {
		System.out.println("Water is necessity for human being");
		return taxVisitor.visit(this);
	}

}
