package string.countstringpunctuation;
import java.util.*;

public class DivideStringNEqualParts {
	static void divide(String s, int n) {
		int len = s.length();
		
		int chars = len/3;
		String[] newString = new String[n];
		int temp = 0;
		if(len%n != 0) {
			System.out.println("This String cannot be equally divided");
		}
		else {
			for(int i=0; i<len ; i = i+chars) {
				newString[temp] = s.substring(i, i+chars);
				temp++;
				
			}
			for(String i : newString) {
				System.out.println(i);
			}
		} 
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Ente N to divide the string equally");
		int n= sc.nextInt();
		divide(s, n);
		
	}
}
