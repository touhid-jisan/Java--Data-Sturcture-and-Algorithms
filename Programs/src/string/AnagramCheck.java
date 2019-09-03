package string.countstringpunctuation;

import java.util.Arrays;

public class AnagramCheck {
	static void check(String s1, String s2) {
		
		String s3 = s1.toLowerCase();
		String s4 = s1.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("String are not anagram");
		}
		else {
			char[] str1 =  s3.toCharArray();
			char[] str2 = s4.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2)) {
				System.out.println(s1 + " and " + s2 + " Strings are anagram");
			} else {
				System.out.println("String are not anagram");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Grab";
		String s2 = "Barg";
		
		check(s1, s2);
	}

}
