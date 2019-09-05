package string;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindrome = "jisan";
		boolean isPalindrome = true;
		for(int i=0; i<palindrome.length()/2;i++) {
			if(Character.toLowerCase(palindrome.charAt(i)) != Character.toLowerCase(palindrome.charAt(palindrome.length()-i-1))) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("\""+palindrome + "\" is a palindrome");
		}
		else {
			System.out.println("\""+palindrome + "\" is not a palindrome");
		}
	}

}
