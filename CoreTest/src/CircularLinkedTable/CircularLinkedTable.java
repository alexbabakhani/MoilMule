package CircularLinkedTable;

import java.util.ArrayList;

import Games.Player;

public class CircularLinkedTable {
	public Node head;
	public Node last;
	private int count=0;
	private int capacity;
	public CircularLinkedTable(int capacity) {
		this.capacity=capacity;
		ArrayList<Node> nodes=new ArrayList<Node>();
		for(int i=0;i<capacity;i++) {
			Node n=new Node();
			n.setTablePosition(i);
			nodes.add(i, n);
		}
		for(int j=1;j<capacity;j++) {
			Node cur=nodes.get(j);
			Node prev=nodes.get(j-1);
			prev.setNextNode(cur);
			cur.setPrevNode(prev);
		}
		nodes.get(capacity-1).setNextNode(nodes.get(0));
		this.head=nodes.get(0);
	}
	public Node AddPlayer(Player player) {
		if(isThereRoom()) {
			Node foundseat=FindNextEmptySeat();
			foundseat.setCurPlayer(player);
			count+=1;
			return foundseat;
		}
		return null;
	}
	public void RemovePlayer(Player p) {
		Node n=head;
		while(n.getCurPlayer().getId()!=p.getId()) {
			n=head.getNextNode();
		}
		n.clearNode();
	}
	public boolean isThereRoom() {
		if (count<capacity) {
			return true;
		}
		return false;
	}
	public Node FindNextEmptySeat(){
		Node tmp=head;
		while(tmp.getCurPlayer()!=null) {
			tmp=tmp.getNextNode();
		}
		return tmp;
	}
}
