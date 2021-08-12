package categories.creational.Abstract_factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType choice) {

        if (FactoryType.Shape.equals(choice)) {
            return new ShapeFactory();
        }
        else if (FactoryType.Color.equals(choice)) {
            return new ColorFactory();
        }

        return null;
    }
}
