package javas.basics.collectionVariables;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Hyundai");
		cars.add("Toyota");
		cars.add("Land Rover");
		cars.add("Ferrari");
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Lamborghini");
		
		for(String car:cars) {
			System.out.println(car);
		}
	}
}
