package OOPconcepts.Inheritance;

public class Person {
	int nationalId;
	String name;
	String address;
	String contact;
	
	public void display() {
		System.out.println(this.nationalId+". "+this.name+" "+
							this.address+"\t"+this.contact);
	}
}
