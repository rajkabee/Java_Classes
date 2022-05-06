package javas.basics.collectionVariables;

public class ArraysExample {
	public static void main(String[] args) {
		int[] num = new int[5];
		//int[] n = {1,2,3,4,5};
		//index starts at 0
		//size is given initially
		//
		num[0] = 12;
		num[1] = 23;
		num[2] = 34;
		num[3] = 45;
		num[4] = 56;
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
		
	}
}
