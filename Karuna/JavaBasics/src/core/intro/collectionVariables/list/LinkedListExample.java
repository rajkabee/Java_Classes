package core.intro.collectionVariables.list;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(5);
		num.add(7);
		num.add(9);
		num.add(11);
		num.add(13);
		for(int x:num) {
			System.out.println(x);
		}
		//System.out.println(num.get(0));
	}
}
