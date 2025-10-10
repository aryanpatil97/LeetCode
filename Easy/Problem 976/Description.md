# 976. Largest Perimeter Triangle

Given an array of integers nums, return the largest perimeter of a triangle with non-zero area, or 0 if no such triangle can be formed.

**Example 1:**
```
Input: nums = [2,1,2]
Output: 5
```

**Constraints:**
- 3 <= nums.length <= 10^4
- 1 <= nums[i] <= 10^6

**Approach:**
- Sort the array, check the largest three sides that can form a triangle.