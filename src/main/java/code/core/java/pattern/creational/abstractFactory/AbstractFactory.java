package code.core.java.pattern.creational.abstractFactory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}