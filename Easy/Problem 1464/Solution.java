public class Solution {
    public int maxProduct(int[] nums) {
        int first = 0, second = 0;
        for (int n : nums) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second) {
                second = n;
            }
        }
        return (first - 1) * (second - 1);
    }
}
