package code.core.java.pattern.behavioral.strategy.sample01;

public class Duck {

	FlyBehaviorStrategy flyBehaviorStrategy;
	QuackBehaviorStrategy quackBehaviorStrategy;
	
	public void setFlyStrategy(FlyBehaviorStrategy flyBehaviorStrategy){
		this.flyBehaviorStrategy = flyBehaviorStrategy;
	}
	
	public void setQuackStrategy(QuackBehaviorStrategy quackBehaviorStrategy){
		this.quackBehaviorStrategy = quackBehaviorStrategy;
	}
	
	public void swim(){
		System.out.println("I can swim. it is basic behavior");
	}
	
	public void diplay(){
		System.out.println("I white color duck");
	}
	
	public void performFly(){
		flyBehaviorStrategy.fly();
	}
	
	public void performQuack(){
		quackBehaviorStrategy.Quack();
	}
}
