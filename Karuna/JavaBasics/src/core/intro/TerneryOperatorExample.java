package core.intro;

import java.util.Scanner;

public class TerneryOperatorExample {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String msg = age<16?"Minor":"Adult";
		System.out.println("You are a "+msg);
	}
}
