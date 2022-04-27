package dataTypes;

public class Operators {
	
	public static void main(String[] args) {
		int x = 7;
		++x;
		System.out.println("x = "+x);
		int y = x++;
		System.out.println("y = "+y+"\tx = "+x);
		int z = ++x;
		System.out.println("z = "+z+"\ty = "+y+"\tx = "+x);
	}
	
	/*
	//Arithmetic
		+
		-
		/
		*
		=  ->Assignment Operator x=y+5;
		% ->Modulus Operator ->Remainder  x=17%5		->2
		
		+=	->x=x+5;		x+=5   
		-=
		/=
		*=
		%=
		
		Unary Operator
		++	-> x=x+1;		x+=1;		x++;
		--
		
	//conditional
		5>7 ->false
		5<7 ->true
		<
		>
		==	equals to o/p
		!=
		!<
		!>
		<=
		>=
		
		
	//logical
	 	AND
	 	OR
	 	NOT
	 	XOR
	 	A	B	A&&B	A||B	A^B
	 	0	0	0		0		0
	 	0	1	0		1		1
	 	1	0	0		1		1
	 	1	1	1		1		0
	 	
	 	A	!A
	 	0	1
	 	1	0
	 	
	 	
	 */
}
