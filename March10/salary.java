import java.util.*;
class salary {
    public static void main(String[] args) {
        double hra = 0, da = 0;
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        if (salary < 12000) {
            hra = 12000 * 0.2;
            da = 12000 * 1.15;
        } else {
            hra = 12000 * 0.15;
            da = 12000 * 0.9;
        }
        double gross = salary + hra + da;
        System.out.println("The gross salary of the employee is: " + gross);
    }
}                                                        