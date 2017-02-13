package code.java.design.pattern.behavioral.visitor.sample02;

interface ICarElement {
    void accept(final ICarElementVisitor visitor);
}