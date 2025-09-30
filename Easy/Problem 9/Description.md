# 9. Palindrome Number

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

**Example 1:**
```
Input: x = 121
Output: true
```

**Example 2:**
```
Input: x = -121
Output: false
```

**Constraints:**
- -2^31 <= x <= 2^31 - 1

**Approach:**
- Negative numbers are not palindromes.
- Reverse the number and compare with the original.
- If equal, it's a palindrome.