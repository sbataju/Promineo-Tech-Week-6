package week6;

public class App {
	public static void main(String[] args) {
		//Instantiating new Deck
		Deck playDeck = new Deck();
		//Instantiating two new players
		Player p1 = new Player("Sam");
		Player p2 = new Player("Shawn");
		
		//Shuffle the deck (with test):
		//System.out.println(playDeck.toString());
		playDeck.shuffle();
		//System.out.println(playDeck.toString());	
		
		//Each player drawing their cards and adding to their hand
		for (int i = 0; i < 26; i++) {
			p1.draw(playDeck);
			p2.draw(playDeck);
		}
		//Testing the describe method for Player class
		//p1.describe();
		//p2.describe();
		
		//Comparing values and changing scores
		int p1Value, p2Value;
		
		for (int i = 0; i < 26; i++) {
			
			p1Value = p1.flip().getValue();
			
			p2Value = p2.flip().getValue();
			
			if (p1Value > p2Value) {
				p1.incrementScore();
				System.out.println(p1.getName() + " wins this round!");
			}
			else if (p2Value > p1Value) {
				p2.incrementScore();
				System.out.println(p2.getName() + " wins this round!");
			}
			else {
				System.out.println("Draw");
			}
			System.out.println("Score - " + p1.getName() + ": " + p1.getScore()
								+ " " + p2.getName() + ": " + p2.getScore() + "\n");
		}
		
		//Displaying final score and winner of the game.
		System.out.println("Final Score - " + p1.getName() + ": " + p1.getScore()
		+ " " + p2.getName() + ": " + p2.getScore() + "\n");
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " wins the game!");
		}
		else if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " wins the game!");
		}
		else {
			System.out.println("The game is a draw!");
		}

	}//end of main method

}//end of class
