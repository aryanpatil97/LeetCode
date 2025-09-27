# 26. Remove Duplicates from Sorted Array

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Return the number of unique elements in `nums`.

**Example 1:**
```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
```

**Constraints:**
- 1 <= nums.length <= 3 * 10^4
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order.

**Approach:**
- Use two pointers: one for iterating, one for placing unique elements.
- Overwrite duplicates in-place.