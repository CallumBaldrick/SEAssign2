package nuigalway.app.my_app;
import java.util.ArrayList;

import org.joda.time.LocalDate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestClass 
    extends TestCase
{
    public void testGetUserName()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	String expectedUsername = "Callum Baldrick21";
    	assertEquals(expectedUsername,student1.getUsername());
    }
    
    public void testSetUserName()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	String expectedUsername = "Callum Baldrick21";
    	student1.setUsername("Callum Baldrick21");
    	assertEquals(expectedUsername,student1.getUsername());
    }
    
    
    
    public void testGetName()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	assertEquals("Callum Baldrick",student1.getName());
    }
    public void testSetName()
    {
    	Student student1 = new Student("Cal Bal",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	student1.setName("Callum Baldrick");
    	assertEquals("Callum Baldrick",student1.getName());
    }
    
    
    public void testGetAge()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	assertEquals(21,student1.getAge());
    }
    public void testSetAge()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	student1.setAge(22);
    	assertEquals(22,student1.getAge());
    }
    
    
    
    public void testGetDOB()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,null);
    	assertEquals(new LocalDate(1997,12,4),student1.getDOB());
    }
    public void testSetDOB()
    {
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1939, 8, 31),16451364,null,null);
    	student1.setDOB(new LocalDate(1997,12,4));
    	assertEquals(new LocalDate(1997,12,4),student1.getDOB());
    }
    
    public void testGetModule()
    {
    	ArrayList<String> modules = new ArrayList<String>();
        modules.add("CT4101");
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,modules);
    	student1.addModule("CT417");
    	assertEquals(modules,student1.getModules());
    }
    
    public void testSetModule()
    {
    	ArrayList<String> modules = new ArrayList<String>();
    	ArrayList<String> modules1 = new ArrayList<String>();
        modules.add("CT4101");
    	Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,modules1);
    	modules.add("CT417");
    	student1.setModules(modules);
    	assertEquals(modules,student1.getModules());
    }
    
    
    
  
    
    
    
}
