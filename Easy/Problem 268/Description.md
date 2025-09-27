# 268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

**Example 1:**
```
Input: nums = [3,0,1]
Output: 2
```

**Constraints:**
- n == nums.length
- 1 <= n <= 10^4
- 0 <= nums[i] <= n
- All the numbers of nums are unique.

**Approach:**
- Use the sum formula for 0 to n and subtract the sum of the array.