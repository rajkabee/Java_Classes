package javas.basics.collectionVariables;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		
		age.put("Ram", 25);
		age.put("Shyam", 34);
		age.put("hari", 19);
		System.out.println(age.get("hari"));
		for(Map.Entry<String, Integer> e:age.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}
}
