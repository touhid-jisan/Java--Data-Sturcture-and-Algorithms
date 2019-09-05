package string;

public class CountTotalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " Md. Touhidul Islam Jisan";
		int count =0;
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i) == ' ' && Character.isLetter(name.charAt(i+1)) && i>0) {
				count++;
			}
		}count++;
		System.out.println("Total No. of Strings in \""+ name + " \" " + count); 
	}

}
