package collectionVariables;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
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
