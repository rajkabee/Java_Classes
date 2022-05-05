package javas.basics.controlStatements.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter base and the power: ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int p = sc.nextInt();
		int temp = p;
		int res = 1;
		while(p>0) {
			res*=b;
			p--;
		}
		System.out.println(b+" to the power "+temp+" = "+res);
		System.out.println(String.format("%d ^ %d = %d", b, temp,res ));
	}
}
