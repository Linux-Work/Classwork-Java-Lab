import java.util.Scanner;

interface IntOperations {
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    boolean isPalindrome();
    int factorial();
    int sumOfDigits();
}

class MyNumber implements IntOperations {
    private int num;

    public MyNumber() {
        this.num = 0;
    }

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome() {
        int rev = 0, n = num;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev == num;
    }

    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public int sumOfDigits() {
        int sum = 0, n = num;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}

public class AS19Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        MyNumber num = new MyNumber(n);
        int choice = 0;

        while (choice != 7) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Check if the number is positive or negative.");
            System.out.println("2. Check if the number is even or odd.");
            System.out.println("3. Check if the number is prime.");
            System.out.println("4. Check if the number is palindrome.");
            System.out.println("5. Calculate the factorial of the number.");
            System.out.println("6. Calculate the sum of digits of the number.");
            System.out.println("7. Exit.");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (num.isPositive()) {
                        System.out.println("The number is positive.");
                    } else {
                        System.out.println("The number is negative.");
                    }
                    break;
                case 2:
                    if (num.isEven()) {
                        System.out.println("The number is even.");
                    } else {
                        System.out.println("The number is odd.");
                    }
                    break;
                case 3:
                    if (num.isPrime()) {
                        System.out.println("The number is prime.");
                    } else {
                        System.out.println("The number is not prime.");
                    }
                    break;
                case 4:
                    if (num.isPalindrome()) {
                        System.out.println("The number is a palindrome.");
                    } else {
                        System.out.println("The number is not a palindrome.");
                    }
                    break;
                case 5:
                    int factorial = num.factorial();
                    System.out.println("The factorial of the number is " + factorial + ".");
                    break;
                case 6:
                    int sum = num.sumOfDigits();
                    System.out.println("The sum of digits of the number is " + sum + ".");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        input.close();
    }
}
