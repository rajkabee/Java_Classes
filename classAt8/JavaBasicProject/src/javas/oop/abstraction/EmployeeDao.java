package javas.oop.abstraction;

public class EmployeeDao extends DataAccessObject<Employee> {

	@Override
	public int save(Employee t) {
		System.out.println("Employee saved to the database.");
		return 0;
	}

	@Override
	public Employee getOne(int id) {
		System.out.println("The Employee id Hari khadka.");
		return null;
	}
	
}
