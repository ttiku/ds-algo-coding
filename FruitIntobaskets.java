package dsalgo;

import java.util.HashMap;
import java.util.Map;

public class FruitIntobaskets {
    public static int findMaxFruitInBaskets(int[] fruits) {
        int startWindow = 0;
        Map<Integer, Integer> mm = new HashMap<>();
        int maxLength = 0;
        for (int endWindow = 0; endWindow < fruits.length; endWindow++) {
            mm.put(fruits[endWindow], mm.getOrDefault(fruits[endWindow], 0) + 1);
            while (mm.size() > 2 ){
                int startNum = fruits[startWindow];
                mm.put(startNum, mm.get(startNum) - 1);
                if (mm.get(startNum) == 0) {
                    mm.remove(startNum);
                }
                startWindow++;
            }
            maxLength = Math.max(maxLength, endWindow - startWindow + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(findMaxFruitInBaskets(fruits));
    }
}
