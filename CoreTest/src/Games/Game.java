package Games;
import java.util.List;
public interface Game {
	public GameType GameName();
	public int MaxCardsPerHand();
	public int MaxCardsOnTable();
	public List<Player> GetPlayers();
	
}
