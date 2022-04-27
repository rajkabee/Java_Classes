package OOPconcepts.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int x=5, y=7, z=23;
		System.out.println(add(x,y));
		System.out.println(add(x,y,z));
	}
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public static int add(int a, int b, int c) {
		int  d= a+b+c;
		return d;
	}
}
