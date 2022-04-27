package coreJava.jdbc;

public class Student {
	public int id;
	public String fName;
	public String lName;
	public String email;
	
	public Student() {
	}
	
	public Student(int id, String fName, String lName, String email) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	
	public Student(String fName, String lName, String email) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	
	
}
