Problem: Generate Parentheses (LeetCode 22)

Statement: Given n pairs of parentheses, generate all combinations of well-formed parentheses.

Approach: Backtracking with counts.
- Track counts of open and close used
- Only add '(' if open < n
- Only add ')' if close < open

Why this pattern: Classic Catalan-structure enumeration via constraints; pruning invalid states early.

Complexity:
- Time: O(Cn) where Cn is nth Catalan number
- Space: O(n) recursion depth plus output

Edge Cases:
- n = 0 yields [""]
