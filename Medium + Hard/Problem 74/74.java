// Solution for LeetCode 74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++) {if(search(matrix[i], target)) return true;}
        return false;
    }
    private boolean search(int[] nums, int x) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == x) return true;
            if (nums[m] < x) l = m + 1;
            else h = m - 1;
        }
        return false;
    }
}