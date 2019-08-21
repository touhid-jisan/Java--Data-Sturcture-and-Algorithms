package oop.inheritance.polymorphism.ex1;

public class Editor  extends Staff{
	
	public void printUserType() {
		System.out.println("editor");
	}
	public void approveReview() {
		System.out.println("Editor: approve review");
	}
}
