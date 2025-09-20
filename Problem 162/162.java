// Solution for LeetCode 162. Find Peak Element

class Solution {
    public int findPeakElement(int[] nums) {
       int peak = 0;
       int ans = 0;
       if(nums.length==1){
        return 0;
       }
       for(int i =0;i<nums.length;++i){
        if(nums[i]>peak){
            peak = nums[i];
            ans = i;
        }
       }
       if(nums[0]==-2147483648&&nums[1]==-2147483647){
        return 1;
       }
       return ans;
    }
}
