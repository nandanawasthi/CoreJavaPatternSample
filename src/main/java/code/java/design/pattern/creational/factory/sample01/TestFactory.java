package code.java.design.pattern.creational.factory.sample01;

public class TestFactory {

	public static void main(String[] args) {
		// create a small dog
	    Animal animal = AnimalFacotry.getAnimal("small");
	    animal.animal();

	    // create a big dog
	    animal = AnimalFacotry.getAnimal("mid");
	    animal.animal();

	    // create a working dog
	    animal = AnimalFacotry.getAnimal("big");
	    animal.animal();

	}

}
