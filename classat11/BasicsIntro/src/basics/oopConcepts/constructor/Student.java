package basics.oopConcepts.constructor;

public class Student {
	
	int id;
	String name;
	String email;
	long contact;
	
	public Student(int id, String name, String email, long contact) {
		this.id = id;
		this.name= name;
		this.email = email;
		this.contact = contact;
	}

	public Student() {
	}
	
}
