import mathop.MathsOperations;
import statop.StatsOperations;
import java.util.Scanner;

public class AS20Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            nums[i] = input.nextInt();
        }

        int max = MathsOperations.findMax(nums);
        int min = MathsOperations.findMin(nums);
        double average = StatsOperations.findAverage(nums);
        double median = StatsOperations.findMedian(nums);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);
        input.close();
    }
}
