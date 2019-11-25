package nuigalway.app.my_app;
import java.util.ArrayList;

import org.joda.time.LocalDate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ModuleTest extends TestCase{
	
	
	public void testGetModuleName()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
    	assertEquals("Software Engineering 3",module1.getModuleName());
    }
	
	public void testSetModuleName()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
		module1.setModuleName("Machine Learning");
    	assertEquals("Machine Learning",module1.getModuleName());
    }
	
	public void testGetModuleID()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
    	assertEquals("CT417",module1.getModuleID());
    }
	public void testSetModuleID()
    {
		Module module1 = new Module("Software Engineering 3", "CT417", null, null);
		module1.setModuleID("CT4101");
    	assertEquals("CT4101",module1.getModuleID());
    }
	
	
	public void testGetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", students, null);
		students.add("CallyB");
    	assertEquals(students,module1.getStudents());
    }
	public void testSetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> students1 = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", students1, null);
		students.add("CallyB");
		module1.setStudents(students);
    	assertEquals(students,module1.getStudents());
    }
	
	public void testGetCourses()
    {
		ArrayList<String> courses = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", null, courses);
		courses.add("4BP");
    	assertEquals(courses,module1.getCourses());
    }
	public void testSetCourses()
    {
		ArrayList<String> courses = new ArrayList<String>();
		ArrayList<String> courses1 = new ArrayList<String>();
		Module module1 = new Module("Software Engineering 3", "CT417", null, courses1);
		courses.add("4BP");
		module1.setCourses(courses);
    	assertEquals(courses,module1.getCourses());
    }

}
