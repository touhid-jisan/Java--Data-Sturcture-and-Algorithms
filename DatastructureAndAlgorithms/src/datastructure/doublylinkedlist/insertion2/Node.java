package datastructure.doublylinkedlist.insertion2;

public class Node {
	Employee employee;
	Node next;
	Node prev;
	public Node(Employee employee) {
		this.employee =  employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return employee.toString();
	}
	
}
