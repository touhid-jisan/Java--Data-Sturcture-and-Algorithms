package constructor.overloading;


public class User {
	String fname;
	String lname;
	int salary;
	
	public User (String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public User(String fname, String lname, int salary) {
		this(fname, lname);
		this.salary = salary;
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}
}
