public class PrimeNumber {
    public static void isPrime(int num) {
        boolean flag = true;
        for(int i=2; i<=num/2; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int maxCheck = 100;
        for(int i=2; i<=maxCheck; i++) {
            isPrime(i);
        }   
    }
}