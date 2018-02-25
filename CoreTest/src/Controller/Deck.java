package Controller;
import java.util.Arrays;

import Enum.CardFace;
import Enum.CardSuit;
import Games.Card;

public class Deck {
	private Card[] cards;
	private int count=0;
	
	public Card[] GetDeck() {
		return cards;
	}
	private Deck() {
		MakeDeck();
	}
	public int GetCount() {
		return count;
	}
	public void ClearDeck() {
		cards=null;
	}
	public void MakeDeck() {
		if(cards==null) {
			cards=new Card[52];
		}


		for(CardSuit s : CardSuit.values()) {
			for(CardFace f : CardFace.values()) {
				Card c=new Card(f,s);
				cards[count]=c;
				count+=1;
			}
		}

	}
	public static Deck NewDeck() {
		Deck deck=new Deck();
		return deck;
	}
	public String toString() {
		StringBuilder stringbuilt=new StringBuilder();
		for(int i=0;i<cards.length;i++) {
			stringbuilt.append(i+":"+cards[i].toString());
		}
		return stringbuilt.toString();
	}
	public void Shuffle() {
		int[] x=new int[cards.length];
		Arrays.fill(x, -1);
		for(int i=0;i<cards.length;i++) {
			int location=FindOrder(x);
			x[location]=i;
		}
		for(int i=0;i<cards.length;i++) {
			Card tempcard=cards[i];
			cards[i]=cards[x[i]];
			cards[x[i]]=tempcard;
		}
		
	}
	private int FindOrder(int[] order) {
		int rand=(int)(Math.random()*cards.length);
		while(order[rand]!=-1) {
			rand=(int)(Math.random()*cards.length);
		}
		return rand;
	}
}
