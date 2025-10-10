# 771. Jewels and Stones

Given two strings jewels and stones, return the number of stones that are also jewels.

**Example 1:**
```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
```

**Constraints:**
- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.

**Approach:**
- Use a HashSet to store jewels, then count stones that are jewels.