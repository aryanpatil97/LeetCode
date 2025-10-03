# 392. Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

**Example 1:**
```
Input: s = "abc", t = "ahbgdc"
Output: true
```

**Constraints:**
- 0 <= s.length <= 100
- 0 <= t.length <= 10^4
- s and t consist only of lowercase English letters.

**Approach:**
- Use two pointers to check if all characters of s appear in t in order.