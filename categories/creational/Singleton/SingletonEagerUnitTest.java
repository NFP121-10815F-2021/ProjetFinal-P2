package categories.creational.Singleton;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SingletonEagerUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SingletonEagerUnitTest
{
    /**
     * Default constructor for test class SingletonEagerUnitTest
     */
    public SingletonEagerUnitTest()
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
    public void test_SingletonEager() {
        SingletonEager instanceOneSingletonEager = SingletonEager.getInstance(); // = new SingletonEager(); is private
        SingletonEager instanceTwoSingletonEager = SingletonEager.getInstance();
        assertEquals(instanceOneSingletonEager.hashCode(), instanceTwoSingletonEager.hashCode());
    }
    
    @Test
    public void test_SingletonLazy() {
        SingletonLazy instanceOneSingletonLazy = SingletonLazy.getInstance();
        SingletonLazy instanceTwoSingletonLazy = SingletonLazy.getInstance();
        assertEquals(instanceOneSingletonLazy.hashCode(), instanceTwoSingletonLazy.hashCode());
    }
    
    @Test
    public void test_SingletonEagerCounter() {
        SingletonEager instanceOneSingletonEager = SingletonEager.getInstance(); // = new SingletonEager(); is private
        SingletonEager instanceTwoSingletonEager = SingletonEager.getInstance();
        assertEquals(SingletonEager.counter, 1);
    }
    
    @Test
    public void test_SingletonLazyCounter() {
        SingletonLazy instanceOneSingletonLazy = SingletonLazy.getInstance();
        SingletonLazy instanceTwoSingletonLazy = SingletonLazy.getInstance();
        assertEquals(SingletonLazy.counter, 1);
    }
}
