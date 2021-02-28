package test;

import app.Calculator;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;

import org.junit.BeforeClass; 
import org.junit.AfterClass;

import org.junit.runner.JUnitCore;

/**
 * Basic test class using @Test, @Before @After and @Ignore annotation
 * as welll as assert keyword and assertEqual methods
 */
//No more extending Testcase class now 

public class CalculatorTest {

    private static Calculator calculator = new Calculator();


    //add for compatibibitlty in old versions of junit without annotations to run tests
    
 
    public static junit.framework.Test suite() {
       return new JUnit4TestAdapter(CalculatorTest.class);
    }
 
  //To run tests with annotations in new version with main method

  public static void main(String args[]) {
        new JUnitCore().run(CalculatorTest.class);
    }

//Class level one time initializations and destroy annotations

  @BeforeClass
    // must be static and public   method name can be any name
    public static  void MyTest() {
        System.out.println("Starting the calculator test..");
        
    }

   @AfterClass 
    // must be static  and public   method name can be any name
    public static  void Close() {
        System.out.println("Closing the Class test calculator ..\n");
         
    }


    @Before
    // must be public  
    public void InitCalculator() {
        System.out.println("Iinitialising the calculator test..");
        calculator.clear();
    }

   @After
    // must be public  
    public void CloseCalculator() {
        System.out.println("Closing the calculator test..\n");
        calculator.clear();
    }

    //==================================
    //=            Test cases          =
    //==================================
    @Test
    public void CheckAddition() {
        System.out.println("Running the calculator add test..");
        calculator.add(1);
        calculator.add(1);
        assertEquals(calculator.getResult(), 2);
       System.out.println("The calculator add test success..");
    }

    @Test
    public void RunSubtract() {
         System.out.println("Running the calculator suntract test..");
        calculator.add(10);
        calculator.substract(2);
        assertEquals(calculator.getResult(), 8);
        System.out.println("The calculator subtract test success..");
    }

    @Test
    public void TryDivide() {
        System.out.println("Running the calculator divide test..");
        calculator.add(8);
        calculator.divide(2);
        int res = calculator.getResult();
        
        assert (res== 4);//another way to check 
       //program error and not test failure considered in above statetement

       assertEquals(res, 4);

       System.out.println("The calculator divide test success..");
    }

    @Test(expected = ArithmeticException.class) //check for exception
    public void divideByZero() {
         System.out.println("Running the calculator divide by zero test..");
         calculator.divide(0);
         System.out.println("The calculator divide by zero test success..");
    }

    // @Ignore has a String parameter which displays a message
     @Test
    // @Ignore("not ready yet now")  //this test is ignored
    public void GetMultiply() {
        System.out.println("Running the calculator multiply test..");
        calculator.add(10);
        calculator.multiply(10);
        assertEquals(calculator.getResult(), 10);
       System.out.println("The calculator multiply test success..");
    }

//Test timeout for a method

   //@Test(expected = Exception.class, timeout=6000) // time out value  in msec
   @Test(timeout=1100)
    public void ChekTimeOut()throws Exception {
        System.out.println("Running the calculator Time out test..");
        calculator.getLongTime();         
        int res = calculator.getResult();  
        

       assertEquals(res, 101);

       System.out.println("The calculator Time out test success..");
    }

}
