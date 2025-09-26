class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is less than next element, 
            // then peak must be on the right side
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, peak is on the left side (including mid)
                right = mid;
            }
        }
        // Left and right converge to the peak index
        return left;
    }
}