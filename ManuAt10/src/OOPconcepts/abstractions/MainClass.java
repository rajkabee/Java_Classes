package OOPconcepts.abstractions;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		sDao.connect();
		sDao.insert(new Student());
		Student st = sDao.getOne(1);
		System.out.println(st);
		ArrayList<Student> stList = sDao.getAll();
		System.out.println("List:");
		for(Student s : stList) {
			System.out.println(s);
		}
		sDao.update(st);
		sDao.delete(1);
		sDao.disconnect();
	}
}
