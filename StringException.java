import java.util.Scanner;

public class StringException{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        System.out.print("Enter a double: ");
        double d = Double.parseDouble(scan.nextLine());
        System.out.print("Enter a integer: ");
        int i = Integer.parseInt(scan.nextLine());
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}