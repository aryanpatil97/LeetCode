class Solution {
    public int reductionOperations(int[] nums) {
        java.util.Arrays.sort(nums);
        long res = 0;
        int n = nums.length;
        int ops = 0; // number of distinct larger values seen so far
        for (int i = n - 1; i > 0; --i) {
            if (nums[i] != nums[i - 1]) {
                ops++;
            }
            res += ops;
        }
        return (int) res;
    }
}
