package datastructure.doublylinkedlist.insertion1;

public class Node {
	int data;
	Node next;
	Node prev;
	public Node(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " "+data ;
	}
	
	
}

