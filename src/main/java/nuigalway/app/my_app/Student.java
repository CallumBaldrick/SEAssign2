package nuigalway.app.my_app;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import java.util.ArrayList;


public class Student {
	
	String name;
	int age;
	LocalDate DOB;
	long ID;
	String username;
	ArrayList<String> modules = new ArrayList<String>();
	


	public Student(String name, int age, LocalDate dOB, long iD, String username, ArrayList<String> modules) {
	super();
	this.name = name;
	this.age = age;
	DOB = dOB;
	ID = iD;
	this.username = username;
	this.modules = modules;
}
	
	public ArrayList<String> getModules() {
		return modules;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
	
	public void addModule(String module) 
	{
		modules.add(module);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName()
	{return name;}
	
	public void setName(String name)
	{this.name=name;}
	
	public int getAge()
	{return age;}
	
	public LocalDate getDOB()
	{return DOB;}
	
	public void setDOB()
	{DOB=DOB;}
	
	public Long getID()
	{return ID;}
	
	public void setID()
	{ID=ID;}
	
	public String getUsername()
	{username=name+age;
	return username;}

}
