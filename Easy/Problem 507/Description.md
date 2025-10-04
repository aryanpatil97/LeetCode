# 507. Perfect Number

A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding itself. Given an integer n, return true if n is a perfect number, otherwise false.

**Example 1:**
```
Input: num = 28
Output: true
```

**Constraints:**
- 1 <= num <= 10^8

**Approach:**
- Iterate up to sqrt(num), sum divisors, and check if sum equals num.