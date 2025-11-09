public class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length) return findMedianSortedArrays(b, a);
        int m = a.length, n = b.length;
        int low = 0, high = m;
        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;
            int aLeft = (i == 0) ? Integer.MIN_VALUE : a[i-1];
            int aRight = (i == m) ? Integer.MAX_VALUE : a[i];
            int bLeft = (j == 0) ? Integer.MIN_VALUE : b[j-1];
            int bRight = (j == n) ? Integer.MAX_VALUE : b[j];

            if (aLeft <= bRight && bLeft <= aRight) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
                } else {
                    return (double) Math.max(aLeft, bLeft);
                }
            } else if (aLeft > bRight) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted or invalid");
    }
}
