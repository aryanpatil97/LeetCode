# 258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

**Example 1:**
```
Input: num = 38
Output: 2
```

**Constraints:**
- 0 <= num <= 2^31 - 1

**Approach:**
- Use the digital root formula: if num == 0 return 0, else return 1 + (num - 1) % 9.