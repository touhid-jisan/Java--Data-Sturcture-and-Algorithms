package datastructure.doublylinkedlist.insertion1;


public class LinkedList {
	Node head;
	
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
	
	
	
	public void printList() {
		if(head == null) {
			System.out.println("No Node Available");
		}
		Node last = head;
		while(last != null) {
			System.out.print(last + " ");
			last = last.next;
		}
		
	}
	
}
