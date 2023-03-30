import java.util.Scanner;

public class CountAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitSum = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            digitSum += digit;
            tempNumber /= 10;
        }
        System.out.println("Sum of digits: " + digitSum);

        // Count and print digits from result that are also present in original number
        tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            tempNumber /= 10;
            int count = 0;
            int tempSum = digitSum;
            while (tempSum > 0) {
                int sumDigit = tempSum % 10;
                tempSum /= 10;
                if (digit == sumDigit) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(digit + " appears " + count);
            } else {
                System.out.println("No matches found!");
            }
        }
        sc.close();
    }
}