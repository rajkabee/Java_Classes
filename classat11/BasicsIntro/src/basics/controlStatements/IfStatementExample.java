package basics.controlStatements;

import java.util.Scanner;

public class IfStatementExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age<18) {
			System.out.println("You are still a minor...");
		}
		else if(age<60) {
			System.out.println("You are a valued citizen...");
		}
		else {
			System.out.println("you are a senior citizen...");
		}
		
	}
	
	
	/*
	  control statement
	  if(condition){
	  		if true???
	  }
	  else if(condition){
	  			if true???
  		}
  		else{
  			if false???
 		}
	  
	 */
}
