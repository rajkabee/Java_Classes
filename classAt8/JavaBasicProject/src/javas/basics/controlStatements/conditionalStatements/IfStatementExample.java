package javas.basics.controlStatements.conditionalStatements;

import java.util.Scanner;

public class IfStatementExample {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age<18) {
			System.out.println("You are still a minor.");
		}
		else if(age<60) {
			System.out.println("You are a valued citizen of our country!");
		}
		else {
			System.out.println("you are a senior citizen!");
		}
		System.out.println("End");
	}
}
/*
	Control Statements
		that controls the flow of the program
		-conditional Statements
			-if else statement
			-switch case statement
		
		-Loops
			-while loop
			-do while loop
			-for loop
			-advanced for loop
		
*/