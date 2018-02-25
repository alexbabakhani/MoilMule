package Games;

import Controller.Dealer;

public class Player {
	private Hand myHand;
	private int id;
	private String name;
	private int max;
	private Dealer dealer;
	public Player(int Id,String Name, int MaxCards) {
		myHand=new Hand(MaxCards);
		name=Name;
		max=MaxCards;
		id=Id;
	}
	public int getId() {
		return id;
	}
	public void ClearHand() {
		myHand=new Hand(max);
	}
	public void DealCard() {
		myHand.AddCard(dealer.Deal());
	}
	public void setDealer(Dealer d) {
		this.dealer=d;
	}
	public void clearDealer() {
		this.dealer=null;
	}
}
