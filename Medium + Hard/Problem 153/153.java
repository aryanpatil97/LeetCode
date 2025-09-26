// Solution for LeetCode 153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        int min =nums[0];
        for(int i=0;i<nums.length;++i){
            min =Math.min(min,nums[i]);
        }
        return min;
    }
}
