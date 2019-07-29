package datastructure.doublylinkedlist.insertion2;

public class LinkedList {
	Node head;
	public void push(Employee employee) {
		Node new_node = new Node(employee);
		new_node.next = head;
		head = new_node;
	}
	public void printList() {
		Node current = head;
		if(current == null) {
			System.out.println("Empty List");
		}
		while(current != null) {
			System.out.print(current);
			current = current.next;
			System.out.println();
		}
		
	}
}
