package javas.oop.accessModifiers;

public class AccessTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.landlinePhone = "Microtel+NepalTelecom";
		emp.telephoneBooth = "Nepal Telecom";
		emp.setCellPhone("Samsung");
	}
}
