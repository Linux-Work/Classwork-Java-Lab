import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter a operator +, -, *, / ");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println("Addition: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Substraction: " + (n1 - n2));
            case "*":
                System.out.println("Multiplication: " + (n1 * n2));
            case "/":
                System.out.println("Division: " + (n1 / n2));
            default:
                System.out.println("Invalid input!");
        }
    }
}
