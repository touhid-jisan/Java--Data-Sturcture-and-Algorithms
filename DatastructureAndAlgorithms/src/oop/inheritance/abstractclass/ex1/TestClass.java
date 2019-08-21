package oop.inheritance.abstractclass.ex1;

public class TestClass {
	public static void main(String[] args) {
		ConcreteSubClass concrete = new ConcreteSubClass();
		concrete.test2();
		concrete.test3();
		concrete.test1();
		
		//AbstractSuperClass con = new AbstractSuperClass();
		// abstract class are non instantiable means it cannot create abstract lass object, 
	}
}
