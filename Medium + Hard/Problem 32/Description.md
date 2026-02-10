Problem: Longest Valid Parentheses (LeetCode 32)

Statement: Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Approach: Stack tracking indices.
- Push -1 as base index
- For '(' push index; for ')' pop
- After pop: if stack empty push current index; else update max with i - stack.peek()

Why this pattern: Tracks invalid boundaries to measure valid spans efficiently.

Complexity:
- Time: O(n)
- Space: O(n)

Edge Cases:
- Strings starting with ')'
- No valid parentheses
