# 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

**Example 1:**
```
Input: nums = [2,2,1]
Output: 1
```

**Constraints:**
- 1 <= nums.length <= 3 * 10^4
- -3 * 10^4 <= nums[i] <= 3 * 10^4
- Each element in the array appears twice except for one element which appears only once.

**Approach:**
- Use XOR to cancel out pairs and find the single number.