# 66. Plus One

Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

**Example 1:**
```
Input: digits = [1,2,3]
Output: [1,2,4]
```

**Constraints:**
- 1 <= digits.length <= 100
- 0 <= digits[i] <= 9

**Approach:**
- Traverse from the end, add one, handle carry.
- If carry remains, add a new digit at the front.