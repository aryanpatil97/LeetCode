# 896. Monotonic Array

An array is monotonic if it is either monotone increasing or decreasing. Given an integer array nums, return true if the array is monotonic, or false otherwise.

**Example 1:**
```
Input: nums = [1,2,2,3]
Output: true
```

**Constraints:**
- 1 <= nums.length <= 10^5
- -10^5 <= nums[i] <= 10^5

**Approach:**
- Check if the array is non-increasing or non-decreasing.