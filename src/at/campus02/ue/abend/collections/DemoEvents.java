package at.campus02.ue.abend.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoEvents {

	public static void main(String[] args) {
		
		Eventkalender ek = new Eventkalender();
		
		Event evt1 = new Event("Graz","Postgaragen Party",15.00);
		Event evt2 = new Event("Graz","USI Fest",20.00);
		Event evt3 = new Event("Wien","Donauinselfest",50.00);
		
		ek.add(evt1);
		ek.add(evt2);
		ek.add(evt3);
		
		Event byTitle = ek.getByTitle("USI Fest");
		System.out.println(byTitle);
		
		ArrayList<Event> byOrt = ek.getByOrt("Graz");
		System.out.println(byOrt);
		
		Event mostExp = ek.getMostExpensiveByOrt("Graz");
		System.out.println(mostExp);

		double avgPrice = ek.getAvgPreisByOrt("Graz");
		System.out.println("avg price in Graz: "+avgPrice);

		HashMap<String,Integer> result = ek.getCountByOrt();
		System.out.println(result);
		
	}

}
