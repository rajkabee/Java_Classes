package core.intro.oop.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Person p = new Employee();
		p.fName = "Jack";
		p.lName = "Puth";
		p.address = "ny";
		p.display();

		Employee emp = new Employee();
		emp.address = "Ktm";
		emp.fName = "Krishna";
		emp.lName = "Dahal";
		emp.dept = "Marketing";
		emp.post = "Executive";
		emp.empId = 23432;
		emp.salary = 54654f;

		emp.display();
	}
}
