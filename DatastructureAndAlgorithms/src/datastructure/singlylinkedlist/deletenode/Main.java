package datastructure.singlylinkedlist.deletenode;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(1);
		list.push(0);
		list.push(9);
		list.push(13);
		list.push(14);
		list.push(12);
		list.push(16);
		list.push(19);
		list.push(10);
		list.push(90);
		list.printList();
		
		list.deleteNode(1);
		
		list.printList();
		list.deleteNode(3); // delete the node which is equal to this
		
		list.printList();
		
		list.deleteAtPosition(6);   // delete node from given index
		list.printList();
	}

}
