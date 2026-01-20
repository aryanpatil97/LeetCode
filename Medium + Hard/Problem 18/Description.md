Problem: 4Sum (LeetCode 18)

Statement: Given an integer array and a target, find all unique quadruplets that sum to target.

Approach: Sort + nested two-pointer.
- Sort array
- Fix two indices i, j; use two-pointer for remaining pair
- Skip duplicates at all levels

Why this pattern: Extends two-pointer pattern to 4 elements with pruning via sorting.

Complexity:
- Time: O(n^3)
- Space: O(1) extra (excluding output)

Edge Cases:
- Large values causing overflow (use long if needed)
- Many duplicates
