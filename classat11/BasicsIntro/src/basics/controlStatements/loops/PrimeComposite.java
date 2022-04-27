package basics.controlStatements.loops;

import java.util.Scanner;

public class PrimeComposite {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int i=2, flag=0;
		if(num<2) {
			System.out.println("Neither prime nor composite.");
		}else {
			while(i<=(num/2)) {
				System.out.print(i+"\t");
				if(num%i==0) {
					//composite
					flag=1;
					break;
				}
				
				i++;
			}
			if(flag==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Composite");
			}
		}
	}
}
