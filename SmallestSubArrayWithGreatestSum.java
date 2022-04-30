package dsalgo;

public class SmallestSubArrayWithGreatestSum {
    public static int smallestSubArrayWithGraterSum(int S, int[] nums) {
        int startWindow = 0;
        int windowSum = 0;
        int windowMin = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < nums.length ; windowEnd++) {
            windowSum += nums[windowEnd];
            while (windowSum >= S) {
                windowMin = Math.min(windowMin,windowEnd-startWindow+1);
                windowSum -= nums[startWindow];
                startWindow++;

            }
        }
        return windowMin;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};

        System.out.println(smallestSubArrayWithGraterSum(7, arr));
    }
}
