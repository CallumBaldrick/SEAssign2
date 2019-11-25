package nuigalway.app.my_app;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
	
	String courseName;
	ArrayList<String> students = new ArrayList<String>();
	ArrayList<String> modules = new ArrayList<String>();
	LocalDate startDate;
	LocalDate endDate;
	
	public CourseProgramme(String courseName, ArrayList<String> modules, ArrayList<String> students, LocalDate startDate,
			LocalDate endDate) {
		
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	public ArrayList<String> getModules() {
		return modules;
	}
	
	public void addModules(String module) 
	{
		modules.add(module);
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
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

	
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
	

}
