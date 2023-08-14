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
        boolean isPrime = true;
        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                break;
            }
        }
        return isPrime;
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("vvedit chyslo ");
//        int numberToCheck = scanner.nextInt();
//
//        isPrime(numberToCheck);
//    }
}


