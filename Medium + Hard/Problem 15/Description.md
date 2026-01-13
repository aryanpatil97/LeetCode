Problem: 3Sum (LeetCode 15)

Statement: Find all unique triplets in the array which gives the sum of zero.

Approach: Sort + two-pointer.
- Sort the array
- Fix one element and use two-pointer to find pairs summing to -nums[i]
- Skip duplicates for i, left, right

Why this pattern: Sorting enables pruning and duplicate handling; two-pointer yields O(n^2) traversal for pairs efficiently.

Complexity:
- Time: O(n^2)
- Space: O(1) extra (excluding output)

Edge Cases:
- Many duplicates
- No valid triplets
