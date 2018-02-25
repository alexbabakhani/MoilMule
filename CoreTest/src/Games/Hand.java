package Games;

public class Hand {
	public Card[] hand;
	public int count=0;
	
	public Hand(int max) {
		hand=new Card[max];
	}
	public String toString() {
		String myhand=new String("(");
		for(Card c:hand) {
			myhand+=("("+c.toString()+")");
		}
		myhand+=")";
		return myhand;
	}
	public void AddCard(Card c) {
		hand[count]=c;
		count+=1;
	}
	public Card LastDealt() {
		return hand[count];
	}
}
