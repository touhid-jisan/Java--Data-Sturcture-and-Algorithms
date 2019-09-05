package string;

public class CountTotalCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Md. Touhidul Islam Jisan";
		int count =0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!= ' ') {
				count++;
			}
		}
		System.out.println("Total Character at " + name + "\n" + count );
	}

}
