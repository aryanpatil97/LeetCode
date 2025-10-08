# 628. Maximum Product of Three Numbers

Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

**Example 1:**
```
Input: nums = [1,2,3]
Output: 6
```

**Constraints:**
- 3 <= nums.length <= 10^4
- -1000 <= nums[i] <= 1000

**Approach:**
- Sort the array, compare product of last three and product of first two and last one.