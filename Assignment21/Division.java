import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();
        
        try {
            double result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division not possible. Denominator cannot be 0.");
        }
        
        sc.close();
    }
}
