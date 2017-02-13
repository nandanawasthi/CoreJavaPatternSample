package code.java.design.pattern.behavioral.visitor.sample03;

public class Grocessary implements TaxVisitable {

	double price;
	
	public Grocessary(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double accept(TaxVisitor taxVisitor) {
		System.out.println("Food is required for human being");
		return taxVisitor.visit(this);
	}

}
