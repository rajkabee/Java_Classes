package basics.methods;

public class PassByValue {
	public static void main(String[] args) {
		int x =123;
		incr(x);
		System.out.println("X = "+x);
	}

	static void incr(int a) {
		a+=1004;
		System.out.println("X = "+a);
	}
}
