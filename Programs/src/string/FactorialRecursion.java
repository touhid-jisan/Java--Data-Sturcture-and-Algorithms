import java.util.*;

public class FactorialRecursion {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return (n*factorial(n-1));    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int i = factorial(num);
        System.out.println("Factorial of " + num + " is = " + i);
    }
}