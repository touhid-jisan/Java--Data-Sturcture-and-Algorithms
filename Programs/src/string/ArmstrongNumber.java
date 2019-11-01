public class ArmstrongNumber {
    public static void armstrongCheck(int check) {
        int num = check;
        int mod;
        int sum = 0;
        while(num > 0) {
            mod = num %10;
            sum = sum + (int) Math.pow(mod, 3);
            num = num/10;
        }
        if(sum == check) {
            System.out.println("Armstrong Num");
        } else {
            System.out.println("Not Armstrong Num");
        }
    }
    public static void main(String[] args) {
        int check = 153;
        armstrongCheck(check);
    }
}