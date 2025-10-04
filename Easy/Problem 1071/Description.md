# 1071. Greatest Common Divisor of Strings

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

**Example 1:**
```
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
```

**Constraints:**
- 1 <= str1.length, str2.length <= 1000
- str1 and str2 consist of English uppercase letters.

**Approach:**
- Use the GCD of the lengths and check if the substring divides both strings.