package nuigalway.app.my_app;
import java.util.ArrayList;

import org.joda.time.LocalDate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ModuleTest extends TestCase{
	
	
	public void testApp()
    {
        assertTrue( true );
        
    }
	
	public void testGetModuleName()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
    	assertEquals("Software Engineering 3",module1.getModuleName());
    }
	
	public void testGetModuleID()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
    	assertEquals("CT417",module1.getModuleID());
    }
	
	public void testGetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", students, null);
		students.add("CallyB");
    	assertEquals(students,module1.getStudents());
    }
	
	public void testGetCourses()
    {
		ArrayList<String> courses = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", null, courses);
		courses.add("4BP");
    	assertEquals(courses,module1.getCourses());
    }

}
