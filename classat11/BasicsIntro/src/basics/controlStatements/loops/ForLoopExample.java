package basics.controlStatements.loops;

public class ForLoopExample {
	public static void main(String[] args) {
		int i;
			
		for(i=1; i<=5; i++) {			//for(initialization; condition; iteration)
			System.out.println(i+". For loop working...");			
		}
		i=1;
		for( ;i<=5; ) {			//for(initialization; condition; iteration)
			System.out.println(i+". For loop working...");	
			i++;
		}
	}
}
