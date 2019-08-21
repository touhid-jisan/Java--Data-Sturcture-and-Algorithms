package constructor.chaining;

public class Staff extends User{
	int i;
	public Staff() {
		System.out.println("Staff Constructor: Default");
	}
	public Staff(int i) {
		super();// super() will invoked directly User default constructor
		//this.i = i; // this() will invoked staff default constructor then super class default constructor
 		System.out.println("Staff constructor : 2");
	}
}
