package basics.controlStatements.loops;

public class PyramidNestedLoop {
	public static void main(String[] args) {
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(i=1; i<=5; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=6-i; j++) {
				System.out.print("*  ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Diamond");
		System.out.println();
		for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			for(j=1; j<=i-1; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		for(i=1; i<=4; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=5-i; j++) {
				System.out.print("*  ");
			}
			for(j=1; j<=4-i; j++) {
				System.out.print("*  ");
			}
			
			System.out.println();
		}
		
		
		
	}
}
