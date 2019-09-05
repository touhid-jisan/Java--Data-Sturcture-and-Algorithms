package string;

public class ReplaceWhiteSpaceWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Md. Touhidul Islam Jisan";

		name = name.replaceAll("\\s+", "-");
		System.out.println(name);
	}

}
