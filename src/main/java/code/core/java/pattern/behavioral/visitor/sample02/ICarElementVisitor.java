package code.core.java.pattern.behavioral.visitor.sample02;

interface ICarElementVisitor {
    void visit(final Body body);
    void visit(final Car car);
    void visit(final Engine engine);
    void visit(final Wheel wheel);
}