public class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;
        int sign = 1;
        char c = s.charAt(i);
        if (c == '+' || c == '-') { sign = c == '-' ? -1 : 1; i++; }
        long res = 0;
        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;
            res = res * 10 + (ch - '0');
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * res);
    }
}
