Problem 52 — N-Queens II

Short statement
Given n, return the number of distinct solutions to the n-queens puzzle (place n queens so no two attack each other).

Approach
- Backtracking with pruning using columns and diagonals tracking. Efficiently count without storing boards.

Complexity
- Time: exponential in n (but n <= 9 typical constraints), Space: O(n).

Edge cases
- n small (1..3), where known counts are 1/0/0/2...
