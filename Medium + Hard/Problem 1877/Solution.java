// Solution for LeetCode 1877. Minimize Maximum Pair Sum in Array

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
// Solution for LeetCode 1877. Minimize Maximum Pair Sum in Array

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
