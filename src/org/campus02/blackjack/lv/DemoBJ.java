package org.campus02.blackjack.lv;

public class DemoBJ {

	public static void main(String[] args) {
		
		Blackjack bj = new Blackjack();
		
		Player p1 = new Player("Max Mustermann", 25);
		Player p2 = new Player("Susi Sorglos", 22);
		Player p3 = new Player("Ano Nym", 33);
		
		//only add the 2 players
		System.out.println("added "+p1 + "? "+bj.add(p1));
		System.out.println("added "+p2 + "? "+bj.add(p2));
		
		//try to re-add player 2
		System.out.println("added "+p2 + "? "+bj.add(p2));	

		//add card values for both players
		Integer value = 11;
		System.out.println("add card value "+value
				+" for "+p1+"? "+bj.addCard(p1, value));
		
		value = 20;
		System.out.println("add card value "+value
				+" for "+p2+"? "+bj.addCard(p2, value));
		
		//try to add card value for "unknown" player 3
		value = 100;
		System.out.println("add card value "+value
				+" for "+p3+"? "+bj.addCard(p3, value));
		
		//add more card value to player 1
		value = 5;
		System.out.println("add card value "+value
				+" for "+p1+"? "+bj.addCard(p1, value));
		
		//show players
		System.out.println(bj);

	}

}
