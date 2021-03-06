package javas.basics.intro;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		byte b = -128;
		short s;
		s=-32768;
		int i = 2147483647;
		long l = 9223372036854775807l;
		
		float f = 1.234f;
		double d = 0.00025;
		
		char ch = 'e';
		
		boolean bool = true;
		
		String name = "Hello World!";
		System.out.println("Enter a whole number: ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		//string interpolation string formatting
		System.out.println(String.format("The number you entered is : %d", i));
		System.out.println("The number you Entered is : "+i);
	}
}
/*
	Data Types
		Integer
			byte		8bits	00000000-11111111	-128 to +127	
			short		16bits	-32768 to +32767
			int			32bits	+/-2147483648
			long		64bit	+/-9223372036854775808
		
		Float
			float	32bits	
			double	64bits	
		
		Character
			char 0-9 and a-z and A-Z
		Boolean
			boolean  true/false
		String
			String
*/