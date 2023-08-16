import java.util.Scanner;
public class Cykly {
    //1
    public static void kilkist() {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Suma parnih " + sum);
        System.out.println("Kilkist parnyh: " + count);
    }

    public static boolean isPrime(int number) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
            break;
            }
        }
        return isPrime;
    }
    public static int sqrt(int b) {
        int a = (int) Math.sqrt (b);
        System.out.println(a);
        return a;
    }
    static int factor(int n){
        int f = 1;
        for (int i = 1; i <=n; i ++){
            f = f*i;
        }
        return f;
    }

}


