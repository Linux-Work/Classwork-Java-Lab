import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range m: ");
        int m = sc.nextInt();
        System.out.print("Enter the range n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers in the range whose sum of digits is also a prime number:");
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}