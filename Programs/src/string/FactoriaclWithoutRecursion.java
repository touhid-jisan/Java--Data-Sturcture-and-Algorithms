public class FactoriaclWithoutRecursion {
    static int factorial(int num) {
        int sum=1;
        for(int i=1; i<= num; i++) {
            sum = sum*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 10;
        int fact = factorial(num);
        System.out.println(fact);
    }
}