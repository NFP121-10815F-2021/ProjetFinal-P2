package categories.creational.Abstract_factory;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FactoryUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FactoryUnitTest
{
    /**
     * Default constructor for test class FactoryUnitTest
     */
    public FactoryUnitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    
    
    @Test
    public void test_DifferentObjectSameShape() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.Shape);

        Shape square1 = shapeFactory.getShape("Square");
        Shape square2 = shapeFactory.getShape("Square");
        
        assertNotEquals(square1.hashCode(), square2.hashCode());
        assertEquals(square1.areaFormula(), square2.areaFormula());
        
    }
    
    @Test
    public void test_DifferentShape() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.Shape);

        Shape circle = shapeFactory.getShape("Circle");
        Shape square = shapeFactory.getShape("Square");
        
        assertNotEquals(circle.hashCode(), square.hashCode());
        assertNotEquals(circle.areaFormula(), square.areaFormula());
        
    }
    
    @Test
    public void test_DifferentObjectSameColor() {
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color);

        Color color1 = colorFactory.getColor("Red");
        Color color2 = colorFactory.getColor("Red");
        
        assertNotEquals(color1.hashCode(), color2.hashCode());
        
    }
    
    @Test
    public void test_DifferentColor() {
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color);

        Color red = colorFactory.getColor("Red");
        Color green = colorFactory.getColor("Green");
        
        assertNotEquals(red.hashCode(), green.hashCode());
        
    }
}
