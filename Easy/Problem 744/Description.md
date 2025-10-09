# 744. Find Smallest Letter Greater Than Target

Given a list of sorted characters letters and a target character, return the smallest character in the list that is greater than target.

**Example 1:**
```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
```

**Constraints:**
- 2 <= letters.length <= 10^4
- letters consists of lowercase English letters
- letters is sorted in non-decreasing order
- target is a lowercase English letter

**Approach:**
- Use binary search to find the answer.