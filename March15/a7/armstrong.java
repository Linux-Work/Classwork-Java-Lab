import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n;
        int num = n;
        int length = 0;
        while (num > 0) {
            length++;
            num /= 10;
        }
        int sum = 0;
        while (n > 0) {
            sum += (Math.pow(n % 10, length));
            n /= 10;
        }
        if (originalNumber == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}