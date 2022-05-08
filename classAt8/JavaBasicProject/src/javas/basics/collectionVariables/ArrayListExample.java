package javas.basics.collectionVariables;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Hyundai");
		cars.add("Toyota");
		cars.add("Land Rover");
		cars.add("Ferrari");
		cars.add("Tesla");
		cars.add("BMW");
		
		for(String car:cars) {
			System.out.println(car);
		}
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(7); 
		num.add(3);
		num.add(1);
		num.add(9);
		num.add(2);
		
		int l = num.size();
		System.out.println(l);
		for(int j=0; j<l-1; j++) {
			for(int i=0; i<l-j-1; i++) {
				if(num.get(i)>num.get(i+1)) {
					//swap;
					num.set(i,num.get(i)+num.get(i+1));
					num.set(i+1, num.get(i)-num.get(i+1));
					num.set(i, num.get(i)-num.get(i+1));
				}
			}
		}
		for(int n:num) {
			System.out.println(n);
		}
		
		
	}
}
