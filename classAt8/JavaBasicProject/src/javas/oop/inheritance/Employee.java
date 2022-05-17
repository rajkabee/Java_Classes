package javas.oop.inheritance;

public class Employee extends Person{
	int empId;
	String dept;
	String position;
	int salary;
	
	
	public String display() {
		return empId+". "+dept+" "+position+" "+salary+" "+super.display();
	}
	public String personDisplay() {
		return super.display();
	}
}
