import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        int l = 0;
        int r=nums.length-1;
        while(l<r){
            int s = nums[l]+nums[r];
            if(s==k){c++;l++;r--;}
            else if(s>k) r--;
            else l++;
        }
    return c;
    }
}
