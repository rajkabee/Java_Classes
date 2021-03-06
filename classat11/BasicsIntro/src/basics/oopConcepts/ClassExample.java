package basics.oopConcepts;

public class ClassExample {
	public static void main(String[] args) {
		Student st = new Student(456, "Pratyush Rajbhandari",
								"pratyush@gmail.com", 9878886653l);
		Student st1 = new Student();
		st1.id = 123;
		st1.name = "Pranaya Rajbhandari";
		st1.email = "pranaya@gmail.com";
		st1.contact = 98765567644l;
		
		st.school = "LA";
		//st1.school = "gems";
		
		System.out.println(st.display());
		System.out.println(st1.display());
		Student.school = "st. Xaviers";
		System.out.println(Student.school);
	}
	
	
	public static class Student{
		static String school;
		int id;
		String name;
		String email;
		long contact;
		
		public String display() {
			return this.school+"\n"+this.id+". "+this.name+"\t"+this.email+"\t"+this.contact;
		}
		
		public Student() {
			
		}
		
		public Student(int id, String name,
						String email, long contact) {
			this.id=id;
			this.name = name;
			this.email = email;
			this.contact = contact;
		}
		
	}
}
