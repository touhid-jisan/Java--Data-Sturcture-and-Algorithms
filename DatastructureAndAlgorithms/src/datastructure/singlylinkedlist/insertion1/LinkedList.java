package datastructure.singlylinkedlist.insertion1;

public class LinkedList {
	Node head;
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
	}
	public void append(int data) {
		Node n = new Node(data);
		if(head == null) {
			n.next = head;
			head = n;
			return;
		}
		
		n.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = n;
		
	}
	public void insertAfter(Node prev_node, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
}
