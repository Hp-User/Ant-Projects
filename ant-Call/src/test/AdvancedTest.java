package test;

import app.Calculator;
import junit.framework.JUnit4TestAdapter;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This test uses advanced fixture and timeout
 */
public class AdvancedTest extends AbstractParent {

    private static Calculator calculator;

    // Used for backward compatibility (IDEs, Ant and JUnit 3 text runner)
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AdvancedTest.class);
    }

    @BeforeClass
    // must be public and static
    public static void switchOnCalculator() {
        System.out.println("\tSwitch on calculator");
        calculator = new Calculator();
        calculator.switchOn();
    }

    @AfterClass
    // must be public
    public static void switchOffCalculator() {
        System.out.println("\tSwitch off calculator");
        calculator.switchOff();
        calculator = null;
    }

    @Before
    // must be public not protected like the setup
    public void clearCalculator() {
        System.out.println("\tClear calculator");
        calculator.clear();
    }

    //==================================
    //=            Test cases          =
    //==================================
    @Test(timeout = 1000)
    public void squareRoot() {
        calculator.squareRoot(2);
    }

    @Test
    public void square2() {
        calculator.square(2);
        assertEquals(4, calculator.getResult());
    }

    @Test
    public void square4() {
        calculator.square(4);
        assertEquals(16, calculator.getResult());
    }

    @Test
    public void square5() {
        calculator.square(5);
        assertEquals(25, calculator.getResult());
    }

}
