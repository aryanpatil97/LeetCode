# 1470. Shuffle the Array

Given an array nums consisting of 2n elements, return the array in the form [x1,x2,...,xn,y1,y2,...,yn].

**Example 1:**
```
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
```

**Constraints:**
- 1 <= n <= 500
- nums.length == 2n
- 1 <= nums[i] <= 10^3

**Approach:**
- Use a new array, interleave elements from both halves.