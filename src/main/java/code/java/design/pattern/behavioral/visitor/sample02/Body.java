package code.java.design.pattern.behavioral.visitor.sample02;

class Body implements ICarElement {
    public void accept(final ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}