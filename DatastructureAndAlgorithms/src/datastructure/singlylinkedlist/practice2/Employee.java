package datastructure.singlylinkedlist.practice2;

public class Employee {
	private String fname;
	private String lname;
	private int id;
	public Employee(String fname, String lname, int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", id=" + id + "]";
	}
	
	
	
}
