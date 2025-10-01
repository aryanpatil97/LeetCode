# 326. Power of Three

Given an integer n, return true if it is a power of three. Otherwise, return false.

**Example 1:**
```
Input: n = 27
Output: true
```

**Constraints:**
- -2^31 <= n <= 2^31 - 1

**Approach:**
- Keep dividing n by 3 if n > 0, check if you reach 1.