import java.util.Scanner;

class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        if (a == 0) {
            System.out.print("Not a Quadratic Equation" + "\n");
            return;
        }

        int D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.print("Rational and Squared or Rational and Not Squared.");
        }

        else if (D == 0) {
            System.out.print("Roots are equal so only one root.");
        }

        else {
            System.out.print("Root is Imaginary.");
        }
    }
}