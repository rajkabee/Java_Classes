package OOPconcepts.Inheritance;

public class Student extends Person{
	int stId;
	String email;
	float percentage;
	public void display() {
		super.display();
		System.out.println(super.nationalId+" "+this.stId+". "+this.email+" "+this.percentage);
	}
}
