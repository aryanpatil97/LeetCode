public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums, target);
        if (left == nums.length || nums[left] != target) return new int[]{-1, -1};
        int right = lowerBound(nums, target + 1) - 1;
        return new int[]{left, right};
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (nums[m] < target) l = m + 1; else r = m;
        }
        return l;
    }
}
