package core.intro.collectionVariables.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		
		age.put("Ram", 29);
		age.put("Shyam", 32);
		age.put("Hari", 34);
		
		//System.out.println("Shyams age: "+age.get("Shyam"));
		
		for(Map.Entry<String, Integer> e:age.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}
}
