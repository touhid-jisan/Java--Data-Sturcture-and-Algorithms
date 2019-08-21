package oop.inheritance.polymorphism.ex1;

public class Staff extends User {
	
	public int id = 2;
	public void printId() {
		System.out.println("Staff Id : " +id);
		System.out.println("Super Id : "+ super.id);
	}
	public void printUserType() {
		System.out.println("Staff");
	}
	public Review postAReview(String reviewText) {
		System.out.println("Staff: Post a review");
		//Review review = new Review(reviewText);
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}
	public void instanceMethod(double i) {
		System.out.println("staff: " +i);
	}
	
	public void instanceMethod(Staff s) {
		System.out.println("Staff: " + s);
	}
	public static void staticMethod() {
		System.out.println("Staff : Static method ");
	}
}
