package OOPconcepts.abstractions;

import java.util.ArrayList;

public class StudentDao extends DataAccessObject<Student> {

	@Override
	public int insert(Student st) {
		System.out.println("Student added to the database...");
		return 0;
	}

	@Override
	public Student getOne(int id) {
		Student st = new Student(1,"Sudip", "Bista", "Sudip@gmail.com");
		return st;
	}

	@Override
	public ArrayList<Student> getAll() {
		Student st1 = new Student(1,"Sudip", "Bista", "Sudip@gmail.com");
		Student st2 = new Student(1,"Subha", "Rai", "subha@gmail.com");
		Student st3 = new Student(1,"Dipak", "Thapa", "Dipak@gmail.com");
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		return stList;
	}

	@Override
	public int update(Student t) {
		System.out.println("Student data updated syccessfully...");
		return 0;
	}

	@Override
	public int delete(int t) {
		System.out.println("student deleted successfully!");
		return 0;
	}

}
