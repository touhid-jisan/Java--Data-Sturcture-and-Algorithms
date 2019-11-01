public class StringPalindrome {
    public static void main(String args[]) {
        String s = "Aabaabaa";
        s = s.toLowerCase();
        boolean flag = true;
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-1)) {
                flag = false;
                break;
            }
            n--;
        }
        if(flag) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}