package basics.controlStatements;

import java.util.Scanner;

public class TerneryOperatorExample {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		String msg = age>60?"Senior citizen":(age<18?"Minor":"valued Citizen");
		System.out.println(msg);
	}
}
