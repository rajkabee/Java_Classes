package core.intro.collectionVariables.list;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(7);
		num.add(9);
		num.add(11);
		num.add(13);
		for(int x:num) {
			System.out.println(x);
		}
		System.out.println(num.get(0));
	}
}
