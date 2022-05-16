package javas.oop;

public class Student {
	int id;
	String fName;
	String lName;
	String email;
	
	public Student() {	
	}
	
	public Student(int id, String fName, String lName, String email) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	
	public void display() {
		System.out.println(this.id+". "+this.fName+" "+this.lName+"\t"+this.email);
	}
}
