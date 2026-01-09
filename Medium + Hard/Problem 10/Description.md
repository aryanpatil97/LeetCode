Problem: Regular Expression Matching (LeetCode 10)

Statement: Implement regular expression matching with support for '.' and '*' where '.' matches any single character and '*' matches zero or more of the preceding element.

Approach: Dynamic Programming (bottom-up).
- Define dp[i][j] as whether s[i:] matches p[j:]
- Handle '*' by considering zero occurrence (skip preceding + '*') or one occurrence (consume one char if matches)
- Handle '.' as a wildcard match
- Fill DP table from the end towards the start

Why this pattern: DP exhaustively captures overlapping subproblems and handles the two special tokens cleanly and efficiently.

Complexity:
- Time: O(m * n)
- Space: O(m * n)

Edge Cases:
- Patterns with consecutive '*' not allowed (per problem)
- Empty string and pattern combinations
- '*' operating on any preceding literal or '.'
