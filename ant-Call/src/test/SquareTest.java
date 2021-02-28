package test;

import app.Calculator;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
/**
 * This class is a parameterized test case. It uses the values defined in the collection
 * as a parameter.
 */
public class SquareTest {

    private static Calculator calculator = new Calculator();
    private int param;
    private int result;

 //add for compatibibitlty in old versions of junit without annotations
     
//    public static junit.framework.Test suite() {
//        return new JUnit4TestAdapter(SquareTest.class);
//    }
//    public SquareTest() {
//    }

    @Parameters
    public static List param() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 4},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49}         // 7² = 49 not 48
        });
    }

    public SquareTest(int param, int result) {
        this.param = param;
        this.result = result;
    }

    //==================================
    //=            Test cases          =
    //==================================
    @Test
    public void square() {
        System.out.println("Running the Square test ..");
        calculator.square(param);
        assertEquals(result, calculator.getResult());
    }
}
