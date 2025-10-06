# 1342. Number of Steps to Reduce a Number to Zero

Given an integer num, return the number of steps to reduce it to zero. If the current number is even, divide it by 2, otherwise subtract 1.

**Example 1:**
```
Input: num = 14
Output: 6
```

**Constraints:**
- 0 <= num <= 10^6

**Approach:**
- Use a loop, count steps until num is zero.