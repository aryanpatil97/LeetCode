# 169. Majority Element

Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.

**Example 1:**
```
Input: nums = [3,2,3]
Output: 3
```

**Constraints:**
- n == nums.length
- 1 <= n <= 5 * 10^4
- -10^9 <= nums[i] <= 10^9

**Approach:**
- Use the Boyer-Moore Voting Algorithm to find the majority element in O(n) time and O(1) space.