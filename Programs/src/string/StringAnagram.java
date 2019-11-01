public class StringAnagram {

    static void checkAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1 != n2) {
            System.out.println("Not anagram");
        } else {
            int value =0;
            for(int i=0; i<n1; i++) {
                value = value ^  (int) s1.charAt(i);
                value = value ^ (int) s2.charAt(i);
            }
            if(value == 0) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
        
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bac";
        checkAnagram(s1, s2);
        System.out.println(1%10);
    }
}