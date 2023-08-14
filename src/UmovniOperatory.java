import java.util.Scanner;

public class UmovniOperatory {

    //1
    public int isChetnoe(int a, int b) {
        int result;

        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        System.out.println("#1");
        System.out.println("result is:"+ result);
        return result;
    }

    //2
    public void quarter(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("#2: The point belongs to the first quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("#2: The point belongs to the second quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("#2: The point belongs to the third quarter");
        } else if (x > 0 && y < 0) {
            System.out.println("#2: The point belongs to the fourth quarter");
        } else {
            System.out.println("#2: The point lies on one of the axes or at the origin of the coordinates");
        }
    }

    //3
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("#3:");

        System.out.print("num1: ");
        int num1 = scanner.nextInt();

        System.out.print("num2: ");
        int num2 = scanner.nextInt();

        System.out.print("num3: ");
        int num3 = scanner.nextInt();

        int sum = 0;
        if (num1 > 0) {
            sum += num1;
        }
        if (num2 > 0) {
            sum += num2;
        }
        if (num3 > 0) {
            sum += num3;
        }
        System.out.println("The sum of positive numbers: " + sum);
    }

    //4
    public void viraz() {
        System.out.println("#4:");

        int q = 2;
        int w = 3;
        int e = 4;

        int res = (Math.max(q * w * e, q + w + e)) + 3;
        System.out.println("Result: " + res);
    }

    //5
    public void studentGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("#5:");
        System.out.print("Enter the student rating: ");
        int rating = scanner.nextInt();

        char grade;

        if (rating >= 0 && rating <= 19) {
            grade = 'F';
        } else if (rating >= 20 && rating <= 39) {
            grade = 'E';
        } else if (rating >= 40 && rating <= 59) {
            grade = 'D';
        } else if (rating >= 60 && rating <= 74) {
            grade = 'C';
        } else if (rating >= 75 && rating <= 89) {
            grade = 'B';
        } else if (rating >= 90 && rating <= 100) {
            grade = 'A';
        } else {
            System.out.println("The rating should be between 0 and 100");
            return;
        }

        System.out.println("Student assessment: " + grade);
    }
}