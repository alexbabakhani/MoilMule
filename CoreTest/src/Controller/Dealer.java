package Controller;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import Games.Card;
import Games.Hand;
import Games.Player;

public class Dealer {
	private int MAX_HAND=5;
	private Queue<Card> cardQ=new PriorityQueue<Card>();
	private Queue<Card> burnPile=new PriorityQueue<Card>();
	private Table table;
	private Hand tableCards=new Hand(MAX_HAND);
	public String name;
	public Dealer(Deck cards,Table t,String name){
		Shuffle(cards);
		AddDeckToQueue(cards);
		this.table=t;
		this.name=name;
	}
	public void AddPlayer(Player player) {
		table.AddPlayer(player);
		player.setDealer(this);
	}
	public void RemovePlayer(Player player) {
		table.RemovePlayer(player);
		player.clearDealer();
	}
	public void AddDeckToQueue(Deck d) {
		for(Card c:d.GetDeck()) {
			cardQ.add(c);
		}
	}
	public Card LastDealt() {
		return tableCards.LastDealt();
	}
	public void DealTo(Hand hand) {
		hand.AddCard(Deal());
	}
	public Card Deal() {
		Card top=cardQ.remove();
		return top;
	}
	public void Burn(int count) {
		for(int i=0;i<count;i++) {
			burnPile.add(Deal());
		}
	}
	public void PrintDeck() {
		//System.out.println(deck);
	}
	public void PrintCount() {
		//System.out.println(deck.GetCount());
	}
	public void Shuffle(Deck deck) {
		for(int i=0;i<((int)(Math.random()*1000));i++) {
			deck.Shuffle();
		}
	}
}
