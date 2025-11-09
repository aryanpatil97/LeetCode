# 5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Solving pattern and why:
- Use center expansion for each index (and between indices) to find the longest palindrome centered there.
- This is O(n^2) worst-case but simple and fast in practice; Manacher's algorithm gives O(n) but is more complex — center expansion is typically acceptable for interview/code repo usage.

Approach:
- For each index i, expand for odd-length and even-length centers and keep track of the longest substring.

Edge cases:
- empty string -> ""
- all same characters
