package basics.controlStatements.loops;

import java.util.Scanner;

public class NaturanNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int i;
		i=1;
		int sum=1;
		while(i<=n) {
			sum*=3;
			i++;
			System.out.println(sum);
		}
	}
}
