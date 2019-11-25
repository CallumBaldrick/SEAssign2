package nuigalway.app.my_app;
import java.util.ArrayList;

import org.joda.time.LocalDate;
//import org.junit.Test;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<String> modules = new ArrayList<String>();
        modules.add("CT4101");
        
        Student student1 = new Student("Callum Baldrick",21, new LocalDate(1997, 12, 4),16451364,null,modules);
        Module module1 = new Module("Software Engineering 3", "CT417", null, null);
        CourseProgramme course1 = new CourseProgramme("4BP",null,null,new LocalDate(2019,9,9),new LocalDate(2020,5,8));
        
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getDOB());
        System.out.println(student1.getUsername());
        student1.addModule("CT417");
        System.out.println(student1.getModules());
        
        System.out.println(module1.getModuleName());
        System.out.println(module1.getModuleID());
        System.out.println(module1.getStudents());
        System.out.println(module1.getCourses());
        
        System.out.println(course1.getCourseName());
        System.out.println(course1.getModules());
        System.out.println(course1.getStudents());
        System.out.println(course1.getStartDate());
        System.out.println(course1.getEndDate());
        
        

        //module.addStudent(student);
    }
}
