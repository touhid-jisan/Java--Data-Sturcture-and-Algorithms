public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String s = "apbcdpe11abcdeqq2";
        char[] ch = s.toCharArray();
        boolean flag = false;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] != '0') {
                int index =0;
                for(int j=i+1; j<ch.length; j++) {
                    if(ch[i] == ch[j] ) {
                        ch[j] = '0';
                        index++;
                    }
                }
                if(index == 0){
                    System.out.println(ch[i]);
                    flag = true;
                    break;
                }
            } else if(i== ch.length) {
                System.out.println(ch[i]);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("not found");
        }
    }
}