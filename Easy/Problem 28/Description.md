# 28. Find the Index of the First Occurrence in a String

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not part of `haystack`.

**Example 1:**
```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
```

**Constraints:**
- 1 <= haystack.length, needle.length <= 10^4
- haystack and needle consist of only lowercase English characters.

**Approach:**
- Use the built-in `indexOf` method or implement a simple substring search.