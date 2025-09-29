# 58. Length of Last Word

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

**Example 1:**
```
Input: s = "Hello World"
Output: 5
```

**Constraints:**
- 1 <= s.length <= 10^4
- s consists of only English letters and spaces.

**Approach:**
- Trim trailing spaces, then count the length of the last word.