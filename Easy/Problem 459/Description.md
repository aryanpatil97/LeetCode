# 459. Repeated Substring Pattern

Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

**Example 1:**
```
Input: s = "abab"
Output: true
```

**Constraints:**
- 1 <= s.length <= 10^4
- s consists of lowercase English letters.

**Approach:**
- Check if s is a substring of (s + s) with the first and last characters removed.