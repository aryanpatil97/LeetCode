# 242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

**Example 1:**
```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Constraints:**
- 1 <= s.length, t.length <= 5 * 10^4
- s and t consist of lowercase English letters.

**Approach:**
- Count the frequency of each character in both strings and compare.