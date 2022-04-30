package dsalgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubStringWithKDistinctChar {
    public static int longestSubStringWithKDistinctChar(int K, String str) {
        int startWindow = 0;
        Map<Character, Integer> mm = new HashMap<>();
        int maxLength = 0;
        for (int endWindow = 0; endWindow < str.length(); endWindow++) {
            mm.put(str.charAt(endWindow), mm.getOrDefault(str.charAt(endWindow), 0) + 1);
            while (mm.size() > K) {
                char startChar = str.charAt(startWindow);
                mm.put(startChar, mm.get(startChar) - 1);
                if (mm.get(startChar) == 0) {
                    mm.remove(startChar);
                }
                startWindow++;
            }
            maxLength = Math.max(maxLength, endWindow - startWindow + 1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str ="araaci";

        System.out.println(longestSubStringWithKDistinctChar(1, str));
    }
}
