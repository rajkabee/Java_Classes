package javas.basics.controlStatements.conditionalStatements;

import java.util.Scanner;

public class TerneryOperatorExample {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String msg = age<16?"minor":"adult";
		System.out.println(msg);
		
	}
}
