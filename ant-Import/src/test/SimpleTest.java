 
package test;

import junit.framework.TestCase;
import junit.framework.AssertionFailedError;

import app.Calculator;

  
public class SimpleTest extends TestCase {

    private static Calculator calci = null;

    public SimpleTest(String name) {
        super(name);
        calci = new Calculator();    
  
    }

   //called before each test method call
    protected void setUp() {
      System.out.println("Iinitialising the Test");
      calci.clear();       

    }
    //called after each test method call

    protected void tearDown() {

     System.out.println("Closing the Test");
     

    }

    public static void main(String args[]) {
        junit.textui.TestRunner.run(SimpleTest.class);
    }

   //each test method should start with 'testXXX'

    public void testAdd() {
         
       System.out.println("Testing add..");
        assert(calci!=null );
        calci.add(11);
        calci.add(13);
         if(calci.getResult()!=24)
            throw new AssertionError("The sum is not correct!");

        //assertEquals(calci.getResult(), 24);    
      System.out.println("Addition Test Success..!\n");     
    }


    public void testSubtract() {
        System.out.println("Testing subtract..");
        calci.add(10);//first number
        calci.substract(6);
        assertEquals(calci.getResult(), 5);
        System.out.println("Subtraction Test Success..!\n");   
    }

     //is it to be run ?

    public void testDivide() {
        System.out.println("Testing Division..");
        calci.add(8);
        calci.divide(2);
        int res = calci.getResult();
        assertEquals(res, 4);
        System.out.println("Division Test Success..!\n");   
}
  }
