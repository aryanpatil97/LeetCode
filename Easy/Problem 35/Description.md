# 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

**Example 1:**
```
Input: nums = [1,3,5,6], target = 5
Output: 2
```

**Constraints:**
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i], target <= 10^4
- nums contains distinct values sorted in ascending order.

**Approach:**
- Use binary search to find the target or the insert position.