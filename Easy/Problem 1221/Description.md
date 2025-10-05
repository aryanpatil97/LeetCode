# 1221. Split a String in Balanced Strings

Given a balanced string s, split it into the maximum number of balanced strings.

**Example 1:**
```
Input: s = "RLRRLLRLRL"
Output: 4
```

**Constraints:**
- 1 <= s.length <= 1000
- s consists of 'L' and 'R'

**Approach:**
- Track balance between L and R, increment count when balance is zero.