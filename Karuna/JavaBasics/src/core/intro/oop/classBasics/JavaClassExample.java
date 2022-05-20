package core.intro.oop.classBasics;

public class JavaClassExample {
	public static void main(String[] args) {
		// Student st = new Student(3, "Karuna", "Sapkota", "karuna@gmail.com");
		Student st = new Student();

		st.id = 3;
		st.fName = "Karuna";
		st.lName = "Sapkota";
		st.email = "karuna@gmail.com";

		st.display();
		// System.out.println(st.id + ". " + st.fName + " " + st.lName + "\t" +
		// st.email);
	}
}
