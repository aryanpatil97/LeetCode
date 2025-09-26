// Solution for LeetCode 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(nums.length==1&&target!=nums[0]){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        if(nums.length==1&&target==nums[0]){
            ans[0]=0;
            ans[1]=0;
            return ans;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int i = nums.length -1;i>=0;i--){
            if(nums[i]==target){
                ans[1]=i;
                break;
            }
        }
        return ans;
        }
    }