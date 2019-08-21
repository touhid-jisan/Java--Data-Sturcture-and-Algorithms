package oop.inheritance.polymorphism.ex1;

public class User {
	
	public int id =1;
	public void printUserType() {
		System.out.println("USER");
	}
	public void saeWebLink() {
		System.out.println("USER : Save Web Link");
	}
	public Review postAReview(String reviewText) {
		System.out.println("USER : Post A Review");
		Review review = new Review(reviewText);
		return review;
	}
	public static void staticMethod() {
		System.out.println("User : Static method ");
	}
	public void instanceMethod(double d) {
		System.out.println("user: " +d);
	}
	
	public void instanceMethod(User u) {
		System.out.println("user: " + u);
	}
}