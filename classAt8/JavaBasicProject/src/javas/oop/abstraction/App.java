package javas.oop.abstraction;

public class App {
	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		sDao.connect();
		sDao.save(new Student());
		sDao.getOne(1);
		sDao.disconnect();
	}
}
