package code.core.java.pattern.behavioral.visitor.sample02;

class Engine implements ICarElement {
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
