# 278. First Bad Version

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version fails the quality check. Given n versions [1, 2, ..., n], find the first bad version.

You have access to a function `isBadVersion(version)` which returns whether version is bad.

**Example 1:**
```
Input: n = 5, bad = 4
Output: 4
```

**Constraints:**
- 1 <= bad <= n <= 2^31 - 1

**Approach:**
- Use binary search to minimize the number of calls to isBadVersion.