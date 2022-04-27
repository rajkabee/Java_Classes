package collectionVariables;

public class Sorting {
	public static void main(String[] args) {
		int[] num = {5,4,3,2,1};
		int temp;
		
		int i, j, k;
		//Selection Sort
		for(i=0; i<4; i++) {
			for(j=i+1; j<5; j++) {
				if(num[i]>num[j]) {
					num[i] += num[j];
					num[j] = num[i]-num[j];
					num[i] -= num[j];
				}
				for(k=0; k<5; k++) {
					System.out.print(num[k]+"\t");
				}
				System.out.println();
			}
		}
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"\t");
		}
		
		//bubble sort		
/*
for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
//				for(k=0; k<5; k++) {
//					System.out.print(num[k]+"\t");
//				}
				System.out.println();
			}
		}
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"\t");
		}
*/		
		
		
	}
}
