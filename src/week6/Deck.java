package week6;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	//Fields
	private ArrayList <Card> cards;
	
	//Constructors
	public Deck() {
		cards = new ArrayList <Card> ();
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
			//System.out.println(cards.get(i).describe());
		}
	}
	
	//Methods
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card currentCard = cards.get(0);
		cards.remove(0);
		//System.out.println(currentCard.describe());
		return currentCard;
	}
	
	@Override
	public String toString() {
		for (Card card : cards) {
			System.out.println(card.describe());
		}
		return " ";
	}
	
}
