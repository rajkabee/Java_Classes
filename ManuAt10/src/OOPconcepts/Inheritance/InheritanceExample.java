package OOPconcepts.Inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Student st = new Student();
		st.address = "Ktm";
		st.contact = "132132131";
		st.email = "someone@gmail.com";
		st.name = "fname lname";
		st.nationalId = 23213;
		st.percentage = 59.99f;
		st.stId = 13221;
		//System.out.println(st.address);
		st.display();
	}
}
