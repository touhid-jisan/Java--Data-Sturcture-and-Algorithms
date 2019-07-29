package datastructure.doublylinkedlist.insertion2;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Mary" , "Smith", 12);
		Employee emp2 = new Employee("Jane", "Lan", 13);
		Employee emp3 = new Employee("Jhon", "Leon", 14);
		Employee emp4 = new Employee("Sakib", "Hasan", 15);
		
		LinkedList list = new LinkedList();
		
		list.printList();
		
		list.push(emp1);
		list.printList();
		
		list.push(emp2);
		list.push(emp3);
		list.push(emp4);
		list.printList();
		
	}

}
