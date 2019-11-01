import java.util.*;
public class ReverseASentence{
    public static void main(String[] args) {
        String sentence = "My name is jisan";
        String[] s = sentence.split("\\s");
        
        String newString ="";
        for(int i=s.length-1; i>=0 ; i-- ) {
            if(i==0) {
                newString = newString + s[i];
            } else {
                newString = newString + s[i] + " ";
            }
        }
        System.out.println(newString);
    }
}