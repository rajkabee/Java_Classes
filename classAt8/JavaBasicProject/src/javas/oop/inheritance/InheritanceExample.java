package javas.oop.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.address = "ktm";
		emp.nationalId = 123345;
		emp.name = "Santosh";
		emp.empId = 32;
		emp.dept = "Development";
		emp.position = "Project Manager";
		emp.salary = 89000;
		System.out.println(emp.display()+" "+emp.personDisplay());
		
	}
}
