# 67. Add Binary

Given two binary strings `a` and `b`, return their sum as a binary string.

**Example 1:**
```
Input: a = "11", b = "1"
Output: "100"
```

**Constraints:**
- 1 <= a.length, b.length <= 10^4
- a and b consist only of '0' or '1' characters.

**Approach:**
- Use two pointers from the end of both strings.
- Add digits and carry, build the result string.