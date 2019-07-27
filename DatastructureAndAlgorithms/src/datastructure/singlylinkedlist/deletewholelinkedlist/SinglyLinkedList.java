package datastructure.singlylinkedlist.deletewholelinkedlist;

public class SinglyLinkedList {
	Node head;
	public void push(int data) {
		Node new_node = new Node(data);
		
		new_node.next = head;
		head = new_node;
	}
	public void printList() {
		Node current  = head;
		while(current != null) {
			System.out.print(current);
			current = current.next;
		}
		System.out.println();
	}
	
	
	//.................................For Deletion......................................
	
	
	public void deleteNode(int data) {
		Node temp = head;
		Node prev = null;
		
		// if the data is head node
		if(temp != null && temp.data == data ) {
			head = temp.next;
			return;
		}
		
		while (temp!= null && temp.data != data) {
			prev =temp;
			temp = temp.next;
		}
		prev.next = temp.next; 
		if(temp == null) {
			return;
		}
		
	}
	
	public void deleteAtPosition(int pos) {
		Node temp = head;
		Node prev = null;
		if(head == null) {
			return;
		}
		if(pos == 0) {
			head = temp.next;
			return;
		}
		for(int i=0; i<=pos-1; i++) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null || temp.next==null) {
			System.out.println("Index out of bound");
		}
		prev.next = temp.next;
	}
	
	
	// ..v......................................Delete Whole Node...........................
	public void deleteNode() {
		head = null;
		System.out.println("node deleted");
	}
	
}
