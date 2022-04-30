package dsalgo;

import javax.xml.soap.SOAPPart;
import java.lang.reflect.Array;
import java.util.Arrays;

public class AverageOfSubArrays {
    public static double[] findAverageOfSubArray(int k, int[] nums) {
        int startWindow = 0;
        double windowSum = 0;
        double[] res = new double[nums.length - k + 1];
        for (int windowEnd = 0; windowEnd < nums.length ; windowEnd++) {
            windowSum += nums[windowEnd];
            if (windowEnd >= k - 1) {
                res[startWindow] = windowSum / k;
                windowSum -= nums[startWindow];
                startWindow++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        double[] res = findAverageOfSubArray(5, arr);
        System.out.println(Arrays.toString(findAverageOfSubArray(5, arr)));
    }
}
