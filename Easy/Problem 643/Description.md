# 643. Maximum Average Subarray I

Given an array consisting of n integers, find the maximum average value of any contiguous subarray of length k.

**Example 1:**
```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75
```

**Constraints:**
- 1 <= k <= n <= 10^5
- -10^4 <= nums[i] <= 10^4

**Approach:**
- Use sliding window to calculate the sum of each subarray of length k.