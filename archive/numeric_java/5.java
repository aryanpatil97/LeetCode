// Solution for LeetCode 5. Longest Palindromic Substring

class Solution {
    int start = 0,
        end = 0;
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        
        solve(s.toCharArray(), 0);

        return s.substring(start, end + 1);
    }

    public void solve(char[] s, int index) {
        if(index >= s.length)
            return;
        
        int left = index,
            right = index;
        
        while(right < s.length - 1 && s[right] == s[right + 1])
            ++right;
        
        index = right;

        while(left > 0 && right < s.length - 1 && s[left - 1] == s[right + 1]) {
            --left;
            ++right;
        }

        if(end - start < right - left) {
            start = left;
            end = right;
        }
        solve(s, index + 1);
    }
}