package string;

public class ReplaceWhiteSpace {
	public static void main(String[] args) {
		String name = "Touhidul Islam Jisan";
		name = name.replaceAll("\\s+","");
		System.out.println(name);
	}
}
