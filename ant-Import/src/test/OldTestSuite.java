package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Simple class to build a TestSuite out of the individual test classes.
 */
public class OldTestSuite extends TestCase {

    public OldTestSuite (String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SimpleTest.class);
        suite.addTest(new TestSuite(HelloWorldTest.class));
        //suite.addTest(new TestSuite(SquareTest.class));
        return suite;
   }
}
