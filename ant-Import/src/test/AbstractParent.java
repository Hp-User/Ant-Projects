package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Parent class used to understand @Before, @After... life cycle
 */
public abstract class AbstractParent {

    @BeforeClass
    public static void startTestSystem() {
        System.out.println("Start test system");
    }


    @AfterClass
    public static void stopTestSystem() {
        System.out.println("Stop test system");
    }

    @Before
    public void initTestSystem() {
        System.out.println("\nInitialize test system");
    }

    @After
    public void cleanTestSystem() {
        System.out.println("Clean test system");
    }
}
