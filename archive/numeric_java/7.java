// Solution for LeetCode 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        long ans = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(x!=0){
            ans = 10*ans + (x%10);
            x=x/10; 
        }
        if(ans>max||ans<min){
            return 0;
        }
        return (int)ans;
    }
}
