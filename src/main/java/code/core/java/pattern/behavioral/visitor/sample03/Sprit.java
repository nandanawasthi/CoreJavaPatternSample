package code.core.java.pattern.behavioral.visitor.sample03;

public class Sprit implements TaxVisitable {

	double price;
	
	public Sprit(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double accept(TaxVisitor taxVisitor) {
		System.out.println("Sprint is Luxary for human being");
		return taxVisitor.visit(this);
	}

}
