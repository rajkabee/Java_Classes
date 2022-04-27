package collectionVariables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {
	public static void main(String[] args) {
		int[] im = {1,2,3,4,5};
		int[] num = new int[5];
		num[0]=19;
		num[1]=37;
		num[2]=57;
		num[3]=64;
		num[4]=25;
		
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
		int sum=0;
		for(int i=0; i<5; i++) {
			sum+=num[i];
		}
		System.out.println("Average = "+sum/5);
		
		int max = num[0];
		for(int i=1; i<5; i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("Max: "+max);
		
	}
}
