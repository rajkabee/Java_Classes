package basics.controlStatements;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		System.out.println("Enter a choice:\n"+
							"a. Americano\n"+
							"b. Hot Chocolate\n"+
							"c. Cappuccino\n"+
							"d. Mochaccino\n"+
							"e. Cafe Latte\n-"
							);
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Hot Chocolate is served!");
			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		case 'd':
			System.out.println("Mochaccino is served!");
			break;
		case 'e':
			System.out.println("Cafe Latte is served!");
			break;
		default:
			System.out.println("Invalid choice!");
		}
	}
}
