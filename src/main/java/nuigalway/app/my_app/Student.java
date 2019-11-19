package nuigalway.app.my_app;
import org.joda.time.DateTime;


public class Student {
	
	String name;
	int age;
	DateTime DOB;
	long ID;
	String username;
	String modules[];
	
	public Student() 
	{
		name=name;
		age=age;
		DOB=DOB;
		ID=ID;
		username=username;
		modules=modules;
		
	}
	
	public String getName()
	{return name;}
	
	public void setName(String name)
	{name=name;}
	
	public int getAge()
	{return age;}
	
	public void setAge()
	{age=age;}
	
	public DateTime getDOB()
	{return DOB;}
	
	public void setDOB()
	{DOB=DOB;}
	
	public Long getID()
	{return ID;}
	
	public void setID()
	{ID=ID;}
	
	public String getUsername()
	{return username;}
	
	public void setUsername() 
	{username=username;}
	
//	public  getModules()
//	{
//		return modules[];
//	}

}
