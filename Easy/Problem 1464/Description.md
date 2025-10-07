# 1464. Maximum Product of Two Elements in an Array

Given an array nums, return the maximum value of (nums[i]-1)*(nums[j]-1) where i != j.

**Example 1:**
```
Input: nums = [3,4,5,2]
Output: 12
```

**Constraints:**
- 2 <= nums.length <= 500
- 1 <= nums[i] <= 10^3

**Approach:**
- Find the two largest numbers, calculate the product.