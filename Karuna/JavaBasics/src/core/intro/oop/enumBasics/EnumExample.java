package core.intro.oop.enumBasics;

public class EnumExample {
	public static void main(String[] args) {
		Level lvl = Level.MEDIUM;
		System.out.println(lvl);
		
		
		for(Level l :Level.values()) {
			System.out.println(l);
		}
	}
}
