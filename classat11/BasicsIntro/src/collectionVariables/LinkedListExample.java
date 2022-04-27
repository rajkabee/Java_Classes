package collectionVariables;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Rolls Royce");
		cars.add("Lamborghini");
		cars.add("Ferrari");
		cars.add("Tesla");
		//System.out.println(cars.get(3));
		for(String car: cars) {
			System.out.println(car);
		}
		
		
	}
}
