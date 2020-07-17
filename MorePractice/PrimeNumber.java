import java.util.*;

public class PrimeNumber {

    public static boolean checkPrime(int num) {
        boolean flag = true;
        for(int i=2; i<=num/2; i++) {
            if(num%i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int checkPrime2(int num, int x){
        if(num>x) {
            if(num%x != 0) {
                return checkPrime2(num, x++);
            } else {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a num");
       int num = sc.nextInt();
       boolean flag = checkPrime(num);
       
       if(flag) {
           System.out.println("Prime Number");
       } else {

       System.out.println("Not a prime number");
       }
       int flag2 = checkPrime2(num,2);
       if(flag2 == 1) {
        System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}