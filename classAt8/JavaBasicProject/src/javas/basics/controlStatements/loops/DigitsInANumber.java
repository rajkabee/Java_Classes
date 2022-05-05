package javas.basics.controlStatements.loops;

import java.util.Scanner;

public class DigitsInANumber {
	public static void main(String[] args) {
		int num; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int bk = num;
		int i=0;
		while(num>0) {
			num/=10;
			i++;
		}
		System.out.println("Digits in "+bk+" : "+i);
		
	}
}
