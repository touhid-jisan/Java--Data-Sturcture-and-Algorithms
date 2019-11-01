public class ReverseANum {
    static int reverseNumber(int num) {
        int sum =0;
        while(num>0) {
            int mod = num % 10;
            sum = (sum*10) + mod;
            num = num /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 12340;
        System.out.println(reverseNumber(num));
    }
}