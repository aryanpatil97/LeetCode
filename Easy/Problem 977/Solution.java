public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1, idx = n - 1;
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                res[idx--] = l;
                left++;
            } else {
                res[idx--] = r;
                right--;
            }
        }
        return res;
    }
}
