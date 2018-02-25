package Games;
import Enum.CardFace;
import Enum.CardSuit;

public class Card {
	private CardFace face;
	private CardSuit suit;
	public Card() {
		
	}
	public Card(CardFace face, CardSuit suit) {
		this.face=face;
		this.suit=suit;
	}
	public String toString() {
		return face+" of "+suit;
	}
}
