# 1365. How Many Numbers Are Smaller Than the Current Number

Given an array nums, return an array where each element is the count of numbers smaller than it.

**Example 1:**
```
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
```

**Constraints:**
- 2 <= nums.length <= 500
- 0 <= nums[i] <= 100

**Approach:**
- Count frequency, use prefix sum to get counts.