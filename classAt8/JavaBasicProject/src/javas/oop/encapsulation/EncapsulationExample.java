package javas.oop.encapsulation;

public class EncapsulationExample {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(3);
		st.setfName("Sarijini");
		st.setlName("Pradhan");
		st.setEmail("sarojini@gmail.com");
		System.out.println(st.getId()+". "+st.getfName()+" "+st.getlName()+"\t"+
								st.getEmail());
		
	}
}
