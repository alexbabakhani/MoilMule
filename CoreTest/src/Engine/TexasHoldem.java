package Engine;

import java.util.List;

import Controller.Dealer;
import Controller.Table;
import Games.Game;
import Games.GameType;
import Games.Player;

public class TexasHoldem implements Game{
	public final GameType name =GameType.TEXAS_HOLDEM;
	public final int maxCardsPerHand=2;
	public final int maxCardsOnTable=5;
	private double ante;
	private double maxBet;
	private double minBet;
	private Table table;
	private Dealer dealer;
	public TexasHoldem(double ante,double maxBet,double minBet, int numPlayers) {
		this.ante=ante;
		this.maxBet=maxBet;
		this.minBet=minBet;
		table=new Table(this,numPlayers);
		dealer=table.getDealer();
	}
	public void Start() {
		
	}
	public double getAnte() {
		return ante;
	}
	public double getMaxBet() {
		return maxBet;
	}
	public double getMinBet() {
		return minBet;
	}

	@Override
	public GameType GameName() {
		return name;
	}

	@Override
	public int MaxCardsPerHand() {
		return maxCardsPerHand;
	}

	@Override
	public int MaxCardsOnTable() {
		return maxCardsOnTable;
	}

	@Override
	public List<Player> GetPlayers() {
		return null;
	}
	

}
