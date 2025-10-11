import java.util.*;
public class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int n = nums.length;
        int[] pow = new int[n+1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) pow[i] = (pow[i-1] * 2) % mod;
        int left = 0, right = n -1, res = 0;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                res = (res + pow[right - left]) % mod;
                left++;
            } else right--;
        }
        return res;
    }
}
