Problem 334 — Increasing Triplet Subsequence

Short statement
Given an integer array, determine if there exists increasing triplet subsequence (i<j<k with nums[i]<nums[j]<nums[k]).

Approach
- Maintain two sentinel values first and second as minimal possible candidates; iterate and update.

Complexity
- Time: O(n), Space: O(1).

Edge cases
- Short arrays (length < 3), duplicates.
