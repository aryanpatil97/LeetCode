// Solution for LeetCode 1402. Reducing Dishes

import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] s) {
        int maxSum = 0;
        int sum=0;
        Arrays.sort(s);
        for(int i=s.length-1;i>=0;--i){
            sum+=s[i];
            if(sum<0){
                break;
            }
            maxSum+=sum;
        }
        return maxSum;
    }
}
import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] s) {
        int maxSum = 0;
        int sum=0;
        Arrays.sort(s);
        for(int i=s.length-1;i>=0;--i){
            sum+=s[i];
            if(sum<0){
                break;
            }
            maxSum+=sum;
        }
        return maxSum;
    }
}
