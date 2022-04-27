package basics.controlStatements.loops;

public class PrimeRange {
	public static void main(String[] args) {
		int i,num, flag;
		
		for(num=2; num<=100; num++) {
			flag=0;
			i=2;
			while(i<=(num/2)) {
				if(num%i==0) {
					//composite
					flag=1;
					break;
				}
				
				i++;
			}
			if(flag==0) {
				System.out.println(num);
			}
		}
	}
}
