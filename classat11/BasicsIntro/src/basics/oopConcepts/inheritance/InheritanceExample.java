package basics.oopConcepts.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "Ranjit";
		st.nationalId =123123;
		st.address = "ktm";
		st.roll = 123;
		st.faculty = "Computer";
		st.percentage = 83.7f;
		System.out.println(st.display());
	}
}
