package javas.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int x=5, y=7, z=54;
		int sum1 = add(x,y);
		int sum2 = add(x,y,z);
		System.out.println("sum1: "+sum1+"\nsum2: "+sum2);
	}

	
	
	
	
	
	
	
	
	
	private static int add(int x, int y) {
		int res = x+y;
		return res;
	}
	private static int add(int x, int y, int z) {
		int res = x+y+z;
		return res;
	}
}
