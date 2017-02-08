package code.core.java.pattern.behavioral.strategy.sample01;

public class NoFlyStrategy implements FlyBehaviorStrategy {

	public void fly() {
		System.out.println("I can't fly. I don't have wings");
	}

}
