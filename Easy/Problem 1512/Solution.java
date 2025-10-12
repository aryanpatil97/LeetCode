import java.util.*;
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] cnt = new int[101];
        int res = 0;
        for (int n : nums) res += cnt[n]++;
        return res;
    }
}
