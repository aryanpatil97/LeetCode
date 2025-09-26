// Solution for LeetCode 670. Maximum Swap

class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int length = digits.length;
        int[] maxRightIndex = new int[length];
        for (int i = 0; i < length; ++i) {
            maxRightIndex[i] = i;
        }
        for (int i = length - 2; i >= 0; --i) {
            if (digits[i] <= digits[maxRightIndex[i + 1]]) {
                maxRightIndex[i] = maxRightIndex[i + 1];
            }
        }
        for (int i = 0; i < length; ++i) {
            int maxIndex = maxRightIndex[i];
            if (digits[i] < digits[maxIndex]) {
                char temp = digits[i];
                digits[i] = digits[maxIndex];
                digits[maxIndex] = temp;
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
