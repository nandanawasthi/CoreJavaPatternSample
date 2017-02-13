package code.java.design.pattern.behavioral.strategy.sample01;

public class TestStrategy {

	public static void main(String args[]) {
		// Program to an Interface
		Duck cityDuck = new CityDuck();
		Duck forestDuck = new ForestDuck();
		
		FlyBehaviorStrategy flyWithWings = new FlyWithWingsStrategy();
		FlyBehaviorStrategy noFly = new NoFlyStrategy();
		QuackBehaviorStrategy quack = new QuackStrategy();
		QuackBehaviorStrategy mute = new NoQuackStrategy();
		
		forestDuck.setFlyStrategy(flyWithWings);
		forestDuck.setQuackStrategy(quack);
		
		forestDuck.performFly();
		forestDuck.performQuack();
		forestDuck.diplay();
		forestDuck.swim();
		
		System.out.println("\n \n \n");
		
		cityDuck.setFlyStrategy(noFly);
		cityDuck.setQuackStrategy(mute);
		
		cityDuck.performFly();
		cityDuck.performQuack();
		cityDuck.diplay();
		cityDuck.swim();
	}
}
