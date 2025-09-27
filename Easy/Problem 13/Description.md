# 13. Roman to Integer

Given a roman numeral, convert it to an integer.

**Example 1:**
```
Input: s = "III"
Output: 3
```

**Example 2:**
```
Input: s = "IV"
Output: 4
```

**Constraints:**
- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M')
- It is guaranteed to be a valid roman numeral.

**Approach:**
- Map each Roman numeral to its value.
- If a smaller value comes before a larger one, subtract it; otherwise, add it.