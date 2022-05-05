package basics.oopConcepts.Encapsulation;

public class EncapsulationExample {
	public static void main(String[] args) {
		Student st = new Student(1, "saurav acharya",
							"saurav@gmail.com", 98767664666l);
		st.setId(123);
		System.out.println(st.getId());
	}
}
