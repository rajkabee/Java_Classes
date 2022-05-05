package basics.oopConcepts.inheritance;

public class Student extends Person{
	int roll;
	String faculty;
	float percentage;
	public String display() {
		return super.display()+"\n"+roll+". "+faculty+"\t"+percentage;
	}
	
}
