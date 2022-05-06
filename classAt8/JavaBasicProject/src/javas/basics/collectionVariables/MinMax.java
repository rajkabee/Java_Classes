package javas.basics.collectionVariables;

public class MinMax {
	public static void main(String[] args) {
		int[] num = {12,34,53,27,9};
		int min, max, avg, i;
		min = num[0];
		max = num[0];
		for(i=1; i<5; i++) {
			if(min>num[i]) {
				min=num[i];
			}
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("Minimum value: "+min);
		System.out.println("Maximum value: "+max);
		
		
		//average
		int sum=0;
		for(i=0; i<5; i++) {
			sum+=num[i];
		}
		avg = sum/5;
		System.out.println("Average(Mean Value): "+avg);
	}
}
