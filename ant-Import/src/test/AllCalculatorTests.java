package test;

import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        SquareTest.class,
        SimpleTest.class,
        HelloWorldTest.class
        })
/**
 * This class is a suite of three other test case classes
 */
public class AllCalculatorTests {

     //For compatibility with old JUNT versions 

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AllCalculatorTests.class);
    }

  

}
