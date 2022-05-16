package javas.basics.collectionVariables;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int i,j, k;
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] B = new int[3][3];//{{1,2,3},{4,5,6},{7,8,9,}};
		int[][] B = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] P = new int[3][3];
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the matrix: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print("B["+i+"]["+j+"]: ");
				B[i][j] = sc.nextInt();
			}
		}
		*/
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				P[i][j]=0;
				//P[i][j] = A[i][0]*B[0][j]+A[i][1]*B[1][j]+A[i][2]*B[2][j];
				for(k=0; k<3; k++) {
					P[i][j]+=A[i][k]*B[k][j];
				}
				
			}
		}
		
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(P[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
