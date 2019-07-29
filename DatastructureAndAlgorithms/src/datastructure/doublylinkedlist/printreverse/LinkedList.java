package datastructure.doublylinkedlist.printreverse;


public class LinkedList {
	static Node head;
	
	public void append(int data) {
		Node new_node = new Node(data);
	
		Node last = head;
		new_node.next = null;
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(last.next != null) {
			last = last.next;
			
		}
		
		last.next = new_node;
		new_node.prev = last;
	}
	
	
	public void push(int data) {
		Node new_node = new Node(data);
		
		new_node.next = head;
		new_node.prev = null;
		head = new_node;
	}

	
	public void printReverse() {
		Node current = head;
		Node temp = null;
		while(current != null) {			
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if(temp !=null) {
			head = temp.prev;
		}
	}
	
	
	
	public void printList() {
		if(head == null) {
			System.out.println("No Node Available");
		}
		Node current = head;
		while(current != null) {
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
		
	}

	
	
}
