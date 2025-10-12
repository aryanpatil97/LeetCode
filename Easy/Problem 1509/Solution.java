import java.util.*;
public class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < nums.length; i++) res = Math.min(res, nums[i+k-1]-nums[i]);
        return res;
    }
}
