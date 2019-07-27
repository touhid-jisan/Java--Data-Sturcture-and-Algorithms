package datastructure.singlylinkedlist.practice2;

public class EmployeeNode {
	
	Employee employee;
	EmployeeNode next;
	public EmployeeNode (Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String toString() {
		return employee.toString();
	}
}
