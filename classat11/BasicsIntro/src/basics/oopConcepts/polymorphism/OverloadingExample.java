package basics.oopConcepts.polymorphism;

public class OverloadingExample {
	public static void main(String[] args) {
		Math m = new Math();
		int a=5, b=8, c=9;
		int res1 = m.add(a, b);
		int res2 = m.add(a, b, c);
		System.out.println(res1+" and "+res2);
	}
}
