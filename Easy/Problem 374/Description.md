# 374. Guess Number Higher or Lower

You are trying to guess a number between 1 and n. You have a function `guess(int num)` which returns -1, 1, or 0 depending on whether your guess is lower, higher, or correct. Return the number you are guessing.

**Example 1:**
```
Input: n = 10, pick = 6
Output: 6
```

**Constraints:**
- 1 <= n <= 2^31 - 1

**Approach:**
- Use binary search to minimize the number of calls to guess.