package datastructure.doublylinkedlist.insertion2;

public class Employee {
	String fname;
	String lname;
	int id;
	public Employee(String fname, String lname, int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFname() {
		return fname;
	}
	
	public void setLFname(String lname) {
		this.lname = lname;
	}
	public String getLame() {
		return lname;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee= Fname : " + fname + ", Lname :" + lname + ", id:" +id;   
	}
}
