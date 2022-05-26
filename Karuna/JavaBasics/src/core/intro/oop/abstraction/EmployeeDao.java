package core.intro.oop.abstraction;

public class EmployeeDao extends AbstractDao {

	@Override
	public void insert() {
		System.out.println("Employee added to the database");

	}

	@Override
	public void read() {
		System.out.println("Employee read from the database");

	}

	@Override
	public void update() {
		System.out.println("Employee updated in the database!");
	}

	@Override
	public void delete() {
		System.out.println("Employee deleted from the database.");
	}

}
