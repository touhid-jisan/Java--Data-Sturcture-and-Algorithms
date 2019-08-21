package constructor.overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User instructor = new User("Touhid" , "Jisan", 20000);
		User student = new User("Hello" ,"World");
		
		System.out.println(instructor);
		System.out.println(student);
		
		Student s = new Student("My", "Name" , 1);
		
		
	}

}
