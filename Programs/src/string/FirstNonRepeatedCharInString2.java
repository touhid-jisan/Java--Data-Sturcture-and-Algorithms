public class FirstNonRepeatedCharInString2 {
    public static void main(String[] args) {
        String s = "affagfagsdafgh";
        int i;
        for(i=0; i<s.length(); i++) {
            boolean flag = true;
            for(int j=0; j<s.length(); j++) {
                if(i!= j && s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}