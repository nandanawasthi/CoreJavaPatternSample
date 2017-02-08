package code.core.java.pattern.behavioral.visitor.sample02;

class Car implements ICarElement {
    ICarElement[] elements;

    public Car() {
        this.elements = new ICarElement[] { new Wheel("front left"),
            new Wheel("front right"), new Wheel("back left"),
            new Wheel("back right"), new Body(), new Engine() };
    }

    public void accept(final ICarElementVisitor visitor) {
        for(final ICarElement elem : elements) {
        	if(elem instanceof Wheel)
        		System.out.println("is an isntance of wheel***********************");
        	else if(elem instanceof Car)
        		System.out.println("is an isntance of Car***********************");
        	else if(elem instanceof Engine)
        		System.out.println("is an isntance of Engine***********************");
        	else if(elem instanceof Body)
        		System.out.println("is an isntance of Body***********************");
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}