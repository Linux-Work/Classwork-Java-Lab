import java.util.Scanner;

class Person {
    String name;
    int id;
    int yearOfJoin;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter year of joining: ");
        yearOfJoin = sc.nextInt();
    }
}

class Teacher extends Person {
    String subTaught;
    double basicSalary;
    double da;
    double hra;
    double epf;

    void input() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject taught: ");
        subTaught = sc.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        da = 1.1 * basicSalary;
        hra = 0.15 * basicSalary;
        epf = 0.12 * basicSalary;
    }

    void annualReport() {
        double totalNetSalary = basicSalary + da + hra;
        double totalEpf = 12 * epf;
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject Taught: " + subTaught);
        System.out.println("Joining Year: " + yearOfJoin);
        System.out.println("Basic Salary per month: " + basicSalary);
        System.out.println("Total Net Salary received per year: " + totalNetSalary);
        System.out.println("Total EPF deposited per year: " + totalEpf);
    }
}

class Student extends Person {
    String course;
    int duration;
    double feesPerSemester;

    void input() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course offered: ");
        course = sc.nextLine();

        System.out.print("Enter course duration in years: ");
        duration = sc.nextInt();

        System.out.print("Enter fees per semester: ");
        feesPerSemester = sc.nextDouble();
    }

    void displayTotalFees() {
        double totalFees = duration * 2 * feesPerSemester; // Assuming 2 semesters per year
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course Offered: " + course);
        System.out.println("Joining Year: " + yearOfJoin);
        System.out.println("Total fees to be paid for " + duration + " years: " + totalFees);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.input();
        teacher.annualReport();

        Student student = new Student();
        student.input();
        student.displayTotalFees();
    }
}