public class IntegerPalindrome {
    public static void checkPalindrome(int check) {
        int num = check;
        int mod, sum=0;
        while(num > 0) {
            mod = num%10;
            sum = (sum *10) + mod;
            num = num / 10;
        }
        if(sum == check) {
            System.out.println("The Integer Is palindrome");
        } else {
            System.out.println("The Integer is not Palindrome");
        }
    }
    public static void main(String[] args) {
        checkPalindrome(11210211);
    }
}