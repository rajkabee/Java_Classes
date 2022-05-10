package javas.basics.collectionVariables;

public class NUpCountExample {
	public static void main(String[] args) {
		int[] num = {2,3,1,-6,8,-3,-1,2};
		int n = 5;
		int count = nUpCount(num, n);
		System.out.println(count);
	}

	private static int nUpCount(int[] num, int n) {
		int sum=0, count=0;
		for(int i=0; i<num.length; i++) {
			if(sum<=5) {
				sum+=num[i];
				if(sum>5) {
					count++;
				}
			}
			else {
				sum+=num[i];
			}
		}
		return count;
	}
}
