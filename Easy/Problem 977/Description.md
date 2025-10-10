# 977. Squares of a Sorted Array

Given a sorted array nums, return an array of the squares of each number sorted in non-decreasing order.

**Example 1:**
```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
```

**Constraints:**
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4

**Approach:**
- Use two pointers from both ends, fill the result array from the end.