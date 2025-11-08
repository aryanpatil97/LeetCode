import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128]; // ASCII
        Arrays.fill(last, -1);
        int res = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last[c] >= left) {
                left = last[c] + 1;
            }
            last[c] = right;
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
