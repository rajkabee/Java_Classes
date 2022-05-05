package javas.basics.controlStatements.loops;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num, i, flag=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		i=2;
		while(i<=(num/2)) {
			if(num%i==0) {
				//composite
				flag=1;
				break;
			}
			System.out.println(i);
			i++;
		}
		if(flag==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}
}
