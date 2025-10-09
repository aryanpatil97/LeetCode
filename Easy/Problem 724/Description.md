# 724. Find Pivot Index

Given an array of integers nums, return the "pivot" index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.

**Example 1:**
```
Input: nums = [1,7,3,6,5,6]
Output: 3
```

**Constraints:**
- 1 <= nums.length <= 10^4
- -1000 <= nums[i] <= 1000

**Approach:**
- Calculate total sum, then iterate and check left sum vs right sum.