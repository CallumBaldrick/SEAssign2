package nuigalway.app.my_app;
import java.util.ArrayList;
import org.joda.time.LocalDate;
public class Module {
	
	String moduleName;
	String moduleID;
	ArrayList<String> students = new ArrayList<String>();
	ArrayList<String> courses = new ArrayList<String>();
	
	public Module(String moduleName, String moduleID, ArrayList<String> students, ArrayList<String> courses) {
		super();
		this.moduleName = moduleName;
		this.moduleID = moduleID;
		this.students = students;
		this.courses = courses;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleID() {
		return moduleID;
	}

	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	
	public void addStudents(String student)
	{
		students.add(student);
	}
	

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	public void addCourses(String course)
	{
		courses.add(course);
	}
	
	
	
	
	
}
