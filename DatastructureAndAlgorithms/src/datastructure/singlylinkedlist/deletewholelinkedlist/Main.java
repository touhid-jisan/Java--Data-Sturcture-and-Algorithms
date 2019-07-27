package datastructure.singlylinkedlist.deletewholelinkedlist;

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
		list.printList(); // print line 1
		
		list.deleteNode(1);
		
		list.printList(); // print line 2
		list.deleteNode(3);
		
		list.printList(); // print line 3
		
		list.deleteAtPosition(6);
		list.printList(); // print line 4
		
		list.deleteNode(); // delete whole node
		list.printList(); // print line 5
		
	}

}
