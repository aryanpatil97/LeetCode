# 27. Remove Element

Given an array `nums` and a value `val`, remove all instances of that value in-place and return the new length.

**Example 1:**
```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_]
```

**Constraints:**
- 0 <= nums.length <= 100
- 0 <= nums[i] <= 50
- 0 <= val <= 100

**Approach:**
- Use two pointers: one for iterating, one for placing non-val elements.
- Overwrite elements in-place.