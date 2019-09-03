package string.countstringpunctuation;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s = "Good Morning! Mr. James Potter. Had your breakfast?";
		for(int i =0; i<s.length() ; i++) {
			if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || 	s.charAt(i) == ';' || 	s.charAt(i) == '?' || 	s.charAt(i) == '/' || 	s.charAt(i) == '\"' || 	s.charAt(i) == ':' ) {
			count++;
			}
		}
		System.out.println(count);
	}

}
