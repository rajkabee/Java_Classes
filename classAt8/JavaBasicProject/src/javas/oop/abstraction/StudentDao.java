package javas.oop.abstraction;

public class StudentDao extends DataAccessObject<Student> {

	@Override
	public int save(Student t) {
		System.out.println("student saved to the database");
		return 0;
	}

	@Override
	public Student getOne(int id) {
		System.out.println("the student is Ram thapa");
		return null;
	}

}
