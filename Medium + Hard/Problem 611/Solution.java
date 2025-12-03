import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) { // fix the largest side
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    // all nums[i..j-1] with nums[j] form valid triangles
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }
}
class Solution {
    public int minimumTotal(java.util.List<java.util.List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        // Initialize dp with the last row
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Bottom-up from second last row
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        return dp[0]; // final answer at the top
    }
}
