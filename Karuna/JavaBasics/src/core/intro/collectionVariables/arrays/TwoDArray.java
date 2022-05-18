package core.intro.collectionVariables.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		int i, j;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
