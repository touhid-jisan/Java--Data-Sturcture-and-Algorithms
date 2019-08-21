package oop.inheritance.polymorphism.ex1;

public class UserTest {

	public void printUserType(User u) {
		u.printUserType();
	}
	
	public void approveReview(Staff s) {
		if(s instanceof Editor) {
			((Editor)s).approveReview();
		}else {
			System.out.println("Invalid Object Pass");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		UserTest ut = new UserTest();
			
		// part 1
		
		/* ut.printUserType(user);
		ut.printUserType(editor);
		ut.printUserType(staff);
		*/
		
		//part 2
		// casting and instanceof demo
		//ut.approveReview(new Staff());		
		//ut.approveReview(new Editor());
		
		//part 3
		/*
		staff.postAReview("");
		
		((Staff) staff).printId();
		
		System.out.println();
		*/
		
		// part 4
		staff.staticMethod();
		staff.instanceMethod(10);
		
		//part 5
	//	staff.instanceMethod(new Staff());
		 
	}

}
