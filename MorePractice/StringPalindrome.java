import java.util.*;

public class StringPalindrome {
    
    private static boolean checkPalindrome2(String s) {
        boolean flag = false;
        s=s.toLowerCase();
        char[] arr = new char[s.length()];
        int ind = 0;
        for(int i =s.length()-1; i>=0; i--) {
            arr[ind] = s.charAt(i);
            ind++;
        }
        
        if(String.valueOf(arr).equals(s)) {
           flag = true;
        }
        return flag;
    }
    
    static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        boolean flag = true;
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(n-1)) {
                flag = false;
            } 

            n--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente a string");
        String s = sc.nextLine();

        boolean flag = checkPalindrome(s);
        System.out.println(flag);

        flag = checkPalindrome2(s);
        System.out.println(flag);
    }

}