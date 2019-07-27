package datastructure.singlylinkedlist.practice1;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();

		
		list.push(1);
		list.printList();
		list.push(2);
		list.printList();
		
		list.append(5);
		list.printList();
		
		list.append(0);
		list.printList();
		list.insertAfter(list.head.next ,8);
		list.printList();
	}

}
