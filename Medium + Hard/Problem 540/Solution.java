// Solution for LeetCode 540. Single Element in a Sorted Array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l =0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]==nums[l+1]) l+=2;
            else return nums[l];
            if(nums[r]==nums[r-1]) r-=2;
            else return nums[r];
        }
        return nums[(r+l)/2];
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l =0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]==nums[l+1]) l+=2;
            else return nums[l];
            if(nums[r]==nums[r-1]) r-=2;
            else return nums[r];
        }
        return nums[(r+l)/2];
    }
}
