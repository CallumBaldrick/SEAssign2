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
	public void testSetCourseName()
    {
		CourseProgramme course1 = new CourseProgramme("CS&IT",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		course1.setCourseName("4BP");
		assertEquals("4BP",course1.getCourseName());
    }
	
	public void testGetStartDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	assertEquals(new LocalDate(2019,9,9),course1.getStartDate());
    }
	public void testSetStartDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		course1.setStartDate(new LocalDate(2019,8,15));
		assertEquals(new LocalDate(2019,8,15),course1.getStartDate());
    }
	
	public void testGetEndDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	assertEquals(new LocalDate(2020,5,8),course1.getEndDate());
    }
	public void testSetEndDate()
    {
		CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		course1.setEndDate(new LocalDate(2021,6,30));
		assertEquals(new LocalDate(2021,6,30),course1.getEndDate());
    }
	
	public void testGetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		CourseProgramme course1 = new CourseProgramme("4BP",null,students,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		students.add("CallyB");
    	assertEquals(students,course1.getStudents());
    }
	public void testSetStudents()
    {
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> students1 = new ArrayList<String>();
		CourseProgramme course1 = new CourseProgramme("4BP",null,students1,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
		students.add("CallyB");
		course1.setStudents(students);
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
	public void testSetModule()
    {
    	ArrayList<String> modules = new ArrayList<String>();
    	ArrayList<String> modules1 = new ArrayList<String>();
        modules.add("CT4101");
        CourseProgramme course1 = new CourseProgramme("4BP",modules1,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
    	course1.addModules("CT417");
    	course1.setModules(modules);
    	assertEquals(modules,course1.getModules());
    }
	

}
