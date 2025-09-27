# 125. Valid Palindrome

Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

**Example 1:**
```
Input: s = "A man, a plan, a canal: Panama"
Output: true
```

**Constraints:**
- 1 <= s.length <= 2 * 10^5
- s consists only of printable ASCII characters.

**Approach:**
- Use two pointers from both ends, skip non-alphanumeric characters, compare ignoring case.