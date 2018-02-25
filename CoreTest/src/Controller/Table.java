package Controller;

import java.util.List;

import CircularLinkedTable.CircularLinkedTable;
import CircularLinkedTable.Node;
import Games.Game;
import Games.Player;

public class Table extends CircularLinkedTable{
	private Game game;
	private Node curPosition;
	private int maxPlayers;
	private double maxBet;
	private double ante;
	private double minBet;
	private Dealer dealer;
	private Deck deck;
	private Button button;
	public int count=0;
	public Table(Game g,int capacity) {
		super(capacity);
		game=g;
		curPosition=super.head;
		deck=Deck.NewDeck();
		dealer=new Dealer(deck,this,"Bob");
		button=new Button();
	}
	public void StartGame() {
		
	}
	public Game getGame() {
		return game;
	}
	
	public Node getCurPosition() {
		return curPosition;
	}
	public Dealer getDealer() {
		return dealer;
	}
	public void setCurPosition(Node curPosition) {
		this.curPosition = curPosition;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public double getMaxBet() {
		return maxBet;
	}

	public void setMaxBet(double maxBet) {
		this.maxBet = maxBet;
	}

	public double getAnte() {
		return ante;
	}

	public void setAnte(double ante) {
		this.ante = ante;
	}

	public double getMinBet() {
		return minBet;
	}

	public void setMinBet(double minBet) {
		this.minBet = minBet;
	}
	
	public void SitDown(Player p) {
		Node n=AddPlayer(p);
		count+=1;
	}
	public void LeaveTable(Player p) {
		RemovePlayer(p);
		count-=1;
	}
	
}
