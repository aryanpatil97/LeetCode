Problem 1679 — Max Number of K-Sum Pairs

Short statement
Given an array and integer k, return the maximum number of disjoint pairs that sum to k.

Approach
- Sort and two-pointer, or use a hash map to count complements.

Complexity
- Time: O(n log n) if sorting, or O(n) with hashmap. Space: O(n) for hashmap.

Edge cases
- Duplicates and zero/negative values.
