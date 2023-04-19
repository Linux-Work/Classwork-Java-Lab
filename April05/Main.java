import java.util.*;

class MCAStudent {
    private int rollno;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    public MCAStudent(int rollno, String name, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void getStudentDetails() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }

    public int getTotalMarks() {
        return (mark1 + mark2 + mark3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        MCAStudent[] students = new MCAStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Roll No for student " + (i+1) + ": ");
            int rollno = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            System.out.print("Enter Name for student " + (i+1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Mark 1 for student " + (i+1) + ": ");
            int mark1 = sc.nextInt();
            System.out.print("Enter Mark 2 for student " + (i+1) + ": ");
            int mark2 = sc.nextInt();
            System.out.print("Enter Mark 3 for student " + (i+1) + ": ");
            int mark3 = sc.nextInt();

            students[i] = new MCAStudent(rollno, name, mark1, mark2, mark3);
        }
        
        Arrays.sort(students, (s1, s2) -> s2.getTotalMarks() - s1.getTotalMarks());

        System.out.println("\nStudents Details in Descending Order of Total Marks:");
        for (MCAStudent student : students) {
            System.out.println("---------------------------------------");
            student.getStudentDetails();
            System.out.println("Total Marks: " + student.getTotalMarks());
        }
    }
}