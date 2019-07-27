package datastructure.singlylinkedlist.practice2;

public class EmployeeLinkedList {

	EmployeeNode head;
	
	public void push(Employee new_data) {
		EmployeeNode new_node = new EmployeeNode(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	public void printList() {
		EmployeeNode current = head;
		while(current != null) {
			System.out.println();
			System.out.print("head -> " + current);
			current = current.next;
		}
		System.out.println();
	}
}
