package basics.methods;

public class MethodWithArrays {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println("Before method call: ");
		for(int i=0; i<5; i++) {
			System.out.print(num[i]+"\t");
		}
		incr(num);
		System.out.println("After method call: ");
		for(int i=0; i<5; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
	}

	private static void incr(int[] num) {
		for(int i=0; i<5; i++) {
			num[i]+=(i*23);
		}
		System.out.println("during method call: ");
		for(int i=0; i<5; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		
	}
}
