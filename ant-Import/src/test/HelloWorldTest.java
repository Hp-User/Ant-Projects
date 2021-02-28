package test;

import junit.framework.TestCase; 
 import app.HelloWorld;

public class HelloWorldTest extends TestCase {
	public HelloWorldTest(String name) {
        super(name);
    }

    protected void setUp() {
    	System.out.println("Setting up the HelloWorldTest");
    }

    protected void tearDown() {
    	System.out.println("Tearing after the HelloWorldTest");
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  junit.textui.TestRunner.run(HelloWorldTest.class);
		 
	}
	public void testSayHello() {
        HelloWorld world = new HelloWorld();
        assert( world!=null );
        System.out.println("testing SayHello()....");
        assertEquals("Hello World",  world.sayHello() );
    }
	public void testGetData() {
        HelloWorld world = new HelloWorld();
        assert( world!=null );
        System.out.println("testing GetData()....");
        assertEquals(112,  world.getData(12));
    }

}
