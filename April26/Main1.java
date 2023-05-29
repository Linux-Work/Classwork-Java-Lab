import java.util.Scanner;

class Employee {
    String Name, Designation;
    double Salary;

    public Employee(String n, String p, double r) {
        Name = n;
        Designation = p;
        Salary = r;
    }

    void Display() {
        System.out.println("Name :" + Name);
        System.out.println("Designation :" + Designation);
        System.out.println("Salary:" + Salary);
    }

}

class Manager extends Employee {
    public Manager(String n, String d, double s) {
        super(n, d, s);

    }
}

class Clerk extends Employee {
    public Clerk(String n, String d, double s) {
        super(n, d, s);

    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of manager and clerk:");
        int n = sc.nextInt();
        Employee[] e = new Manager[n];
        Employee[] e1 = new Clerk[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of " + (i + 1) + "th employee in manager class");
            String s = sc.next();
            String d = sc.next();
            double t = sc.nextDouble();
            e[i] = new Manager(s, d, t);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of " + (i + 1) + "th employee in clerk class");
            String s = sc.next();
            String d = sc.next();
            double t = sc.nextDouble();
            e1[i] = new Clerk(s, d, t);
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += e[i].Salary;
        }
        double avg = sum / n;
        System.out.println("Average of manager class: " + avg);
        double sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum += e[i].Salary;
        }
        double avg1 = sum / n;
        System.out.println("Average of clerk class: " + avg1);
    }
}