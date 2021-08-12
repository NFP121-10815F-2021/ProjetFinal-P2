package categories.creational.Abstract_factory;

public abstract class AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
