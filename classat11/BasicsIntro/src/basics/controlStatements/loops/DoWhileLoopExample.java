package basics.controlStatements.loops;

import java.util.Scanner;

public class DoWhileLoopExample {
	public static void main(String[] args) {
		int i=10;
		do {
			System.out.println("do while loop!");
			i++;
		}while(i<=5);
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			i=2;
			int flag=0;
			if(num<2) {
				System.out.println("Neither prime nor composite.");
			}else {
				while(i<=(num/2)) {
					//System.out.print(i+"\t");
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
			do {
				System.out.println("Do you want to coantinue(y/n): ");
				choice = sc.next().charAt(0);
			}while(!(choice=='y'||choice=='n'));
			
		}while(choice=='y');
	}
}
