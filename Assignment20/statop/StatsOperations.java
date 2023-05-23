package statop;

import java.util.Arrays;

public class StatsOperations {
    public static double findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    public static double findMedian(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0) {
            return (double) (nums[n/2 - 1] + nums[n/2]) / 2;
        } else {
            return (double) nums[n/2];
        }
    }
}
