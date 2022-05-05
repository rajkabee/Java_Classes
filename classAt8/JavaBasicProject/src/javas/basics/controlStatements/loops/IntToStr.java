package javas.basics.controlStatements.loops;

public class IntToStr {

	public static void main(String[] args) {
		int i = 234;
		//String str = Integer.toString(i);
		String str = i+"";
		i=Integer.parseInt(str);
		System.out.println(i);
	}
}
