package collectionVariables;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age= new HashMap<>();
		age.put("Ujjwal", 22);
		age.put("Dipen", 23);
		age.put("Bishesh", 26);
		age.put("", 32);
		
		//System.out.println(age.get(""));
		for(Map.Entry<String, Integer> e:age.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}
}
