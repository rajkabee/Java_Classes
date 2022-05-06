package javas.basics.collectionVariables;

public class SortingArray {
	public static void main(String[] args) {
		int[] num = {5,4,3,2,1};
		int i,j,k, temp;
		
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				if(num[j]>num[j+1]) {
					//swap
					/*
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					*/
					num[j]+=num[j+1];
					num[j+1]=num[j]-num[j+1];
					num[j]-=num[j+1];
				}
				/*
				 for(k=0; k<5; k++) {
					System.out.print(num[k]+"    ");
				}
				System.out.println();
				 */
				
			}
		}
		System.out.println("Output: ");
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"    ");
		}
		
		
	}
}

/*
a=5;12;7;
b=7;5;
a+=b;
b=a-b;
a-=b;
*/

