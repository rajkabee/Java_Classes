package javas.oop.inheritance;

public class Person {
	int nationalId;
	String name;
	String address;
	
	public String display() {
		return nationalId+". "+name+"\t"+address;
	}
}
