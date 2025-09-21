// Solution for LeetCode 1887. Reduction Operations to Make the Array Elements Equal

class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        for(int no: nums) max = Math.max(max, no);

        int res= 0;
        int[] freq = new int[max+1];
        for(int no: nums) freq[no] += 1;

        int left = 0, right = max;
        while(left < right){
            while(freq[left] == 0) left++;

            while(freq[right] == 0) right--;

            res = Math.max(res, left+right);
            if(freq[right] > freq[left]){
                freq[right] -= freq[left];
                left++;
            }else if(freq[right] < freq[left]){
                freq[left] -= freq[right];
                right--;
            }else {
                left++;
                right--;
            }
        }

        return res;
    }
}
