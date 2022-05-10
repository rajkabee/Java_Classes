package javas.basics.collectionVariables;

public class MadhavArray {
	public static void main(String[] args) {
		int[] num = {9, 6, 3, 3, 3, 3, 3, 3, 2, 1, 2, 2, 2, 2, 1};
		int i = isMadhavArray(num, num.length );
		System.out.println(num.length);
		if(i==0) {
			System.out.println("not a madhav series.");
		}
		else {
			System.out.println("it ia  a Madhav array.");
		}
	}

	private static int isMadhavArray(int[] num, int length) {
		int i,j=0, refSum, flag = 1;
		int sum=0;
		for(i=1; sum<length; i++ ) {
			sum+=i;
			
		}
		System.out.println(sum+" "+length);
		if(sum!=length) {
			return 0;
		}
		else {
			sum=0;
			
			for(i=1; sum+j<length; i++) {
				
				refSum=0;
				for(j=0; j<i; j++) {
					refSum +=num[sum+j]; 
				}
				System.out.println("RefSum: "+refSum);
				
				if(refSum!=num[0]) {
					flag=0;
					break;
				}
				sum+=i;
			}
			
			
			
		}
		return flag;
	}
	
}
