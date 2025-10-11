# 1498. Number of Subsequences That Satisfy the Given Sum Condition

Given an array nums and an integer target, return the number of non-empty subsequences such that the sum of the minimum and maximum element is <= target.

Approach:
- Sort and use two pointers; use pow2 precomputation.

Constraints:
- 1 <= nums.length <= 10^5