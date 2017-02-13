package code.java.design.pattern.behavioral.visitor.sample02;

public class VisitorDemo {
    public static void main(final String[] arguments) {
        final ICarElement car = new Car();
		
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}