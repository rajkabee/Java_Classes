package basics.methods;

import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		add(x,y);
	}

	 static void add(int x, int y) {
		
		int sum;
		sum = x+y;
		System.out.println("Sum = "+sum);
	}
}

/*
 Argumented Return-Type
 no-Argumented Return-Type
 no-Argumented no-Return-Type
 Argumented no-Return-Type
*/
