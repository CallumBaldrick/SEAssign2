package nuigalway.app.my_app;

import org.joda.time.LocalDate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        
    }
    
    public void testGetUserName()
    {
    	String expectedUsername = "Callum Baldrick21";
    	String resultusername=student1.getUsername();
    }
}
