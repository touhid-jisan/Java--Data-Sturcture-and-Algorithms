public class PrintRepeatedCharacterInString {
    public static void main(String[] args) {
        String s = "jisjisanxxabcb";
        char[] stringChar = s.toCharArray();
        for(int i=0; i<s.length()-1; i++)  {
            int count = 0;
            if(stringChar[i] != ' ') {
                for(int j=i+1; j<s.length(); j++) {
                    if(stringChar[i] == stringChar[j]) {
                        stringChar[j] = ' ';
                        count++;
                    }
                }
            }
            if(count > 0) {
                System.out.println(stringChar[i]);
            }
        }
    
    }
}