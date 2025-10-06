# 1351. Count Negative Numbers in a Sorted Matrix

Given a m x n matrix grid sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in the grid.

**Example 1:**
```
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
```

**Constraints:**
- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 100
- -100 <= grid[i][j] <= 100

**Approach:**
- Start from bottom-left, move up or right to count negatives.