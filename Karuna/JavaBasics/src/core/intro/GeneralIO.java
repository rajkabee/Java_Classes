package core.intro;

import java.util.Scanner;

public class GeneralIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Hello, "+name+"!");
		System.out.println("Are you a girl(y/n)?");
		char ch = sc.next().charAt(0);
		if(ch=='y') {
			System.out.println("Hello Madam!");
		}
		else {
			System.out.println("Hello Mister!");
		}
	}
}
