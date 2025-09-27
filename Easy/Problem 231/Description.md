# 231. Power of Two

Given an integer n, return true if it is a power of two. Otherwise, return false.

**Example 1:**
```
Input: n = 1
Output: true
```

**Constraints:**
- -2^31 <= n <= 2^31 - 1

**Approach:**
- A power of two has only one bit set in its binary representation. Use bit manipulation: n > 0 && (n & (n - 1)) == 0.