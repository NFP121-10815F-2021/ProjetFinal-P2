package categories.creational.Abstract_factory;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Shape::Circle");
    }
    
    
    public void getArea()
    {
        System.out.println("Shape::Circle, The formula is: π × r2 where r is the radius");
    }
    
    public String areaFormula()
    {
        return "π × r2";
    }
}
