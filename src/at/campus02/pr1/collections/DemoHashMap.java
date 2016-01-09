package at.campus02.pr1.collections;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> myMap = new HashMap<>();
		
		//add a few Bezirk -> Einwohner Mappings
		myMap.put("Deutschlandsberg", 60410);
		myMap.put("Voitsberg", 51691);
		myMap.put("Graz", 273838);
		
		//read back values for specific keys
		Integer ewGraz = myMap.get("Graz");
		System.out.println("Bezirk Graz -> "+ewGraz);
		
		System.out.println("alle Bezirk -> Einwohner Mappings");
		//iterate entries in hashmap using keySet()
		for(String bezirk : myMap.keySet()) {
			  System.out.println(bezirk+": "+myMap.get(bezirk));
		}
		
		//default toString method of map
		System.out.println(myMap);

	}

}
