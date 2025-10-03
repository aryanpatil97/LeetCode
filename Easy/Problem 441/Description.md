# 441. Arranging Coins

You have n coins and you want to build a staircase with these coins. The k-th row has exactly k coins. Return the total number of full staircase rows that can be formed.

**Example 1:**
```
Input: n = 5
Output: 2
```

**Constraints:**
- 1 <= n <= 2^31 - 1

**Approach:**
- Use binary search or solve the quadratic equation to find the largest k such that k*(k+1)/2 <= n.