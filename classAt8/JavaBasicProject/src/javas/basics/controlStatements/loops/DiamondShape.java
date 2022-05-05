package javas.basics.controlStatements.loops;

public class DiamondShape {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n");
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n");
		for(i=1; i<=5; i++) {
			for(j=1; j<i; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=6-i; j++) {
				System.out.print("*  ");
			}

			System.out.println();
		}
		
		
		System.out.println("\n\n");
		for(i=1; i<=5; i++) {
			for(j=1; j<6-i; j++) {
				System.out.print("   ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
