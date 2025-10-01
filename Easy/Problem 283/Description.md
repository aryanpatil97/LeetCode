# 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Example 1:**
```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Constraints:**
- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1

**Approach:**
- Use two pointers: one for placing non-zero elements, one for iterating. Fill the rest with zeroes.