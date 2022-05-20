package core.intro.oop.accessModifier.second;

import core.intro.oop.accessModifier.first.Person;

public class AccessExample2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.telephoneBooth = "Namaste";
		p.setCellPhone("iphone");
		System.out.println(p.getCellPhone());
	}
}
