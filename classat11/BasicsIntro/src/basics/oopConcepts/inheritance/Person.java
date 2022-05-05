package basics.oopConcepts.inheritance;

public class Person {
	int nationalId;
	String name;
	String address;
	public String display(){
		return this.nationalId+". "+this.name+"\t"+this.address;
	}
}
 