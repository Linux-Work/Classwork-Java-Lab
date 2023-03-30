import java.util.Scanner;

class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll: ");
        int roll = sc.nextInt();
        System.out.println("Enter the marks of 5 subject: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = ((double) (total) / 500) * 100;

        String grade = null;

        switch ((int) (percentage / 10)) {
            // for >= 90
            case 10:
            case 9:
                grade = "O";
                break;
            // for >= 80 and <90
            case 8:
                grade = "E";
                break;
            // for >= 70 and <80
            case 7:
                grade = "A";
                break;
            // for >= 60 and <70
            case 6:
                grade = "B";
                break;
            // for >= 50 and <60
            case 5:
                grade = "C";
                break;
            // for >=40 and <50
            case 4:
                grade = "D";
                break;
            default:
                grade = "Fail";
                break;
        }
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}