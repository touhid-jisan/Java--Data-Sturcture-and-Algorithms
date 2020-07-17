public class Fibonacci {
    static int fib(int num) {
        if(num == 1|| num==2) {
            return 1;
        } else if(num==0) {
            return 0;
        }
        return fib(num-1)+fib(num-2);
    }
    static int fib2(int num) {
        if(num==1 || num ==2) {
            return 1;
        } else if(num==0) {
            return 0;
        }
        int num1 = 1; 
        int num2 = 1;
        int num3=1;
        for(int i=3;i<=num; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;

    }
    static void fib3(int num) {
        int num1 = 1, num2=1, num3=1;
        for(int i=3; i<=num; i++) {
            num3 = num1+num2;
            num1=num2;
            num2= num3;
        }
        System.out.println(num3);
    }
    static int fib4(int num) {
        if(num ==1 || num==2) {
            return 1;
        } 
        return fib(num-1)+fib(num-2);
        
    }
    public static void main(String[] args) {
        int num =15;
        for(int i=0; i<num; i++) {
            System.out.print(fib(i)+"\s");
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            System.out.print(fib2(i)+"\s");
        }

        fib3(num);
        System.out.println(fib4(num-1));
    }
}