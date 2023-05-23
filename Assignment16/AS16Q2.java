import java.util.Scanner;

class Employee {
    private int id;
    private String name, department;
    private double salary;

    Employee() {}

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Department: ");
        department = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {}

    Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (getSalary() + bonus));
    }

    double getTotalSalary() {
        return getSalary() + bonus;
    }
}

public class AS16Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = sc.nextInt();

        Manager[] managers = new Manager[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].accept();
        }

        Manager maxSalaryManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
                maxSalaryManager = managers[i];
            }
        }

        System.out.println("Manager with maximum total salary:");
        maxSalaryManager.display();
    }
}