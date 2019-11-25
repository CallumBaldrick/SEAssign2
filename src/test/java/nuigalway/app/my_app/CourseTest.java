package nuigalway.app.my_app;
import java.util.ArrayList;

import org.joda.time.LocalDate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CourseTest extends TestCase{
	
	public void testGetCourseName()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	assertEquals("4BP",course1.getCourseName());
    }
	
	public void testGetStartDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	assertEquals(new LocalDate(2019,9,9),course1.getStartDate());
    }
	
	public void testGetEndDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	assertEquals(new LocalDate(2020,5,8),course1.getEndDate());
    }
	
	public void testGetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		CourseProgramme course1 = new CourseProgramme("4BP",null,students,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		students.add("CallyB");
    	assertEquals(students,course1.getStudents());
    }
	
	public void testGetModule()
    {
    	ArrayList<String> modules = new ArrayList<String>();
        modules.add("CT4101");
        CourseProgramme course1 = new CourseProgramme("4BP",modules,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	course1.addModules("CT417");
    	assertEquals(modules,course1.getModules());
    }

}
