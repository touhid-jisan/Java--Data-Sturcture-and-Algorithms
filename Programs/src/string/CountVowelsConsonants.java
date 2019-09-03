package string.countstringpunctuation;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String s = "Good Morning! Mr. James Potter. Had your breakfast?";
		int vowelCount = 0;
		int consonantCount = 0;
		int punctuationCount = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'  ) {
				vowelCount++;
			} else if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || 	s.charAt(i) == ';' || 	s.charAt(i) == '?' || 	s.charAt(i) == '/' || 	s.charAt(i) == '\"' || 	s.charAt(i) == ':' ) {
				punctuationCount++; 
			}else if((s.charAt(i) >= 'a' && s.charAt(i)<='z')|| ( s.charAt(i) >= 'A' && s.charAt(i)<='Z')) {
				consonantCount++;
			}
		}
		System.out.println("Total Vowels " + vowelCount);
		System.out.println("Total Consonants " + consonantCount);

		System.out.println("Total Punctuation " + punctuationCount);
	}
}
