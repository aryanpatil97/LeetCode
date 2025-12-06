// Solution for LeetCode 154. Find Minimum in Rotated Sorted Array II

class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else { // nums[mid] == nums[right]
                // cannot decide, reduce right by 1
                right--;
            }
        }
        return nums[left];
    }
}
