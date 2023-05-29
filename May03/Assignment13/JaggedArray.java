import java.util.Scanner;

public class JaggedArray {
    private int[][] array;
    private int[] numSubjects;

    public JaggedArray(int[] numSubjects) {
        this.numSubjects = numSubjects;
        this.array = new int[5][];
        for (int i = 0; i < 5; i++) {
            this.array[i] = new int[numSubjects[i]];
        }
    }

    public void inputMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for " + childNames[i] + ":");
            for (int j = 0; j < numSubjects[i]; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    public void showMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            System.out.print(childNames[i] + ": ");
            for (int j = 0; j < numSubjects[i]; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void totalMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects[i]; j++) {
                total += array[i][j];
            }
            System.out.println(childNames[i] + ": Total marks = " + total);
        }
    }

    public void countAbove80() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < numSubjects[i]; j++) {
                if (array[i][j] > 80) {
                    count++;
                }
            }
            System.out.println(childNames[i] + ": Marks above 80 = " + count);
        }
    }

    public void alertBelow30() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numSubjects[i]; j++) {
                if (array[i][j] < 30) {
                    System.out.println("Alert: " + childNames[i] + " has scored less than 30 in subject " + (j+1));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numSubjects = {3, 5, 2, 6, 4};
        JaggedArray ja = new JaggedArray(numSubjects);

        ja.inputMarks();
        ja.showMarks();
        ja.totalMarks();
        ja.countAbove80();
        ja.alertBelow30();
    }
}
