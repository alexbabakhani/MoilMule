package CircularLinkedTable;

import Games.Player;

public class Node {
	private Player curPlayer=null;
	private Node prevNode=null;
	private Node nextNode=null;
	private int tablePosition;
	public Node() {
		
	}
	public Node(Player p) {
		curPlayer=p;
	}
	public Player getCurPlayer() {
		return curPlayer;
	}
	public void setCurPlayer(Player p) {
		curPlayer=p;
	}
	public int getTablePosition() {
		return tablePosition;
	}
	public void setTablePosition(int tablePosition) {
		this.tablePosition = tablePosition;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public void clearNode() {
		curPlayer=null;
	}
}
