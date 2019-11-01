import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(sc.hasNextLine()) {
            boolean flag = false;
            if(year %400 ==0) {
                flag = true;
            } else if(year % 100 ==0) {
                flag = false;
            } else if ( year %4 ==0) {
                flag = true;
            }
            System.out.println(flag);
            year = sc.nextInt();
        }
        
    }
}