package basics.oopConcepts.constructor;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.id = 123;
		st.name = "Sarita Pradhan";
		st.email = "sarita@gmail.com";
		st.contact = 9841061499l;
		Student st1 = new Student(456,
								"Leela Shrestha",
								"leela@gmail.com",
								9878778654l);
		
	}
}
