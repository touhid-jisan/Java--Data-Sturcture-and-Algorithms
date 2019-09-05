package string;

public class CheckOneStringRotationAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "string";
		String s2 = "ringst";
		
		String s3 = s1.concat(s1);
		if(s3.indexOf(s2)!= -1) {
			System.out.println("\"" + s2 + "\" is a rotaion string of \"" + s1 + "\"" );
		}
		else {
			System.out.println("\"" + s2 + "\" is not a rotaion string of " + s1 + "\"" );
		}
	}

}
