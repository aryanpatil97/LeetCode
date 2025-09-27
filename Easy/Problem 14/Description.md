# 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

**Example 1:**
```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

**Constraints:**
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters.

**Approach:**
- Compare characters of each string at the same position.
- Stop when a mismatch is found or end of any string is reached.