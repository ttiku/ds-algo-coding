package dsalgo;

import java.util.Arrays;

public class MaximumSumSubArray {
    public static int findMaxSumOfSubArray(int k, int[] nums) {
        int startWindow = 0;
        int windowSum = 0;
        int res = 0;
        for (int windowEnd = 0; windowEnd < nums.length ; windowEnd++) {
            windowSum += nums[windowEnd];
            if (windowEnd >= k - 1) {
                res = Math.max(res,windowSum);
                windowSum -= nums[startWindow];
                startWindow++;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};

        System.out.println(findMaxSumOfSubArray(3, arr));
    }
}
