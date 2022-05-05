package basics.oopConcepts.Encapsulation;

public class Student {
	private int id;
	private String name;
	private String email;
	private long contact;
	
	
	public Student(int id, String name, String email, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String email, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
	
}
