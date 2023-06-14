package Collect;

import java.util.*;
import java.util.Map.Entry;

public class someClass {

	public static void main(String[] args) {
		
		Map <String, String> map = new HashMap <String, String> ();
		map.put("A", "Argentina");
		map.put("B", "Benagluru");
		map.put("C", "Chennai");
		map.put("D", "Darjeling");
		map.put("E", "Euthopia");
		
		//map.forEach((k, v) -> System.out.println(k+v));
		
		// using entry set
		Iterator <Entry <String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			 Map.Entry <String, String> entry = it.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println("Key: "+key+" Value: "+value);
		}
		
		/* using key set
		Iterator <String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("Key: "+key+" Value: "+value);
		}*/
	}
}












