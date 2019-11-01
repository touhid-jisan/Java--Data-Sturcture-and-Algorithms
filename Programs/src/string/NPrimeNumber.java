public class NPrimeNumber {

    public static void printPrime(int total) {
        int count =0; 
        
        for(int i=2; count<total ; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.print(i+ " ");
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int total = 10;
        printPrime(total);
    }
}