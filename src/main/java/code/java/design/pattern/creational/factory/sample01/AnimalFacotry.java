package code.java.design.pattern.creational.factory.sample01;

public class AnimalFacotry {
	
	public static Animal getAnimal(String animal) {
		if(animal.equalsIgnoreCase("small")) {
			return new Rabbit();
		} else if(animal.equalsIgnoreCase("mid")) {
			return new Dog();
		} else if(animal.equalsIgnoreCase("big")) {
			return new Lion();
		} else {
			return null;
		}
	}
}
