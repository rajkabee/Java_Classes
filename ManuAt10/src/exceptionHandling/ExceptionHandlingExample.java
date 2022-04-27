package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String i;
		do {
			System.out.println("Enter your choice(0/1): ");
			
			i= new Scanner(System.in).next();
			try {
				Integer.parseInt(i);
			}catch(Exception e) {
				System.out.println("Enter a Number!");
				i="2";
			}
			
		}while(!(Integer.parseInt(i)==0||Integer.parseInt(i)==1));
		if(Integer.parseInt(i)==0) {
			System.out.println("your choice is 0.");
		}else {
			System.out.println("Your choice is 1.");
		}
	}
}
