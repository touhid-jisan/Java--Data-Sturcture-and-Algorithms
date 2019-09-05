package string;

public class ReplaceCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Md. Touhidul Islam Jisan";
		StringBuffer newName = new StringBuffer(name);
		
		for(int i=0; i<name.length(); i++) {
			if(Character.isLowerCase(name.charAt(i))) {
				newName.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			}
			else if(Character.isUpperCase(name.charAt(i))) {
				newName.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			}
		}
		System.out.println(name);
		System.out.println("After Replacing Case :"+newName);
	}

}
