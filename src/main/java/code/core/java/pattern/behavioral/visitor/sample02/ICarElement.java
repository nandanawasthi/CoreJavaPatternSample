package code.core.java.pattern.behavioral.visitor.sample02;

interface ICarElement {
    void accept(final ICarElementVisitor visitor);
}