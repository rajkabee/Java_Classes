package javas.basics.controlStatements.loops;

import java.util.Scanner;

public class DoWhileLoopExample {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number: ");
			i=sc.nextInt();
			System.out.println(i);
		}while(i<5);
		
	}
}
