import java.util.Scanner;

public class multiplySingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int result = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                result *= digit;
            }
            n /= 10;
        }
        while (result >= 10) {
            int temp = result;
            result = 1;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0) {
                    result *= digit;
                }
                temp /= 10;
            }
        }
        System.out.println(result);
        sc.close();
    }
}