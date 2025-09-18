// Solution for LeetCode 4. Median of Two Sorted Arrays

import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        double total = 0.0;
        int[] ans = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,ans,0,nums1.length);
        System.arraycopy(nums2,0,ans,nums1.length,nums2.length);
        Arrays.sort(ans);
        int len = ans.length;
        if(len%2!=0){
            double odd = ans.length/2;
            median = ans[(int)odd];
        }
        else if(len%2==0){
            int i = len/2 ;
            total = ans[i-1]+ans[i];
            median = total/2;
        }
        return median;
    }
}
