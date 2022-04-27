package OOPconcepts.encapsulation.accessModifier;

public class MainClass {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.id = 1;
		st2.id = 2;
		final int regNo=123;
		//regNo = 1234567;
		//regNo = 8765784;
		st1.schoolName = "Suryodaya School";
		//st2.schoolName = "Little Angles";
		//st1.fName = "Saroj";
		System.out.println(st1.id+"\t"+st1.schoolName);
		System.out.println(st2.id+"\t"+st2.schoolName);
	}
}
