package core.intro.oop.inheritance;

public class Employee extends Person {
	int empId;
	String dept;
	String post;
	float salary;

	public void display() {
		System.out.println(this.empId + ". " + this.dept + " " + this.post + " " + this.salary);
		super.display();
	}

}
