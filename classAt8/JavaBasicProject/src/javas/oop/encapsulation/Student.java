package javas.oop.encapsulation;

public class Student {
	private int id;
	private String fName;
	private String lName;
	private String email;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfName() {
		return this.fName;
	}
	
	
	
	public void display() {
		System.out.println(this.id+". "+this.fName+" "+this.lName+"\t"+this.email);
		
	}
}
