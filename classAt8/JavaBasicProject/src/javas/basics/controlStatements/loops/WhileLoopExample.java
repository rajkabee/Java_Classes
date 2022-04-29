package javas.basics.controlStatements.loops;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		//i-> iterator
		int i = 0;			//initialization
		while(i<5) {		//while(condition)
			System.out.println("While loop!");
			i++;			//iteration
		}
		
		
		//Sum of n natural numbers
		i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of 10 natural numbers: "+sum);
		
		//factorial
		i=1;
		int fact=1;
		while(i<=10) {
			fact*=i;
			i++;
		}
		System.out.println("factorial of 10: "+fact);
		
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		i=1;
		while(i<11) {
			System.out.println(num+" X "+i+" = "+num*i);
			i++;
		}
		
		//count the digits in a number
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int temp = num;
		i=0;
		while(num>0) {
			num/=10;
			i++;
		}
		System.out.println("Number of digits in "+temp+" is "+i);
		
		
	}
}
