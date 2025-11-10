// Solution for LeetCode 153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                // min is in right half
                left = mid + 1;
            } else {
                // min is at mid or in left half
                right = mid;
            }
        }
        return nums[left];
    }
}
