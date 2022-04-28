package basics.accessModifiers.main;

public class MyClass {
	private void feed() {
		System.out.println("Eating...");
	}
	protected void wash() {
		feed();
		System.out.println("Washing clothes...");
	}
	public void knock() {
		System.out.println("Knocking on the door...");
	}
}
