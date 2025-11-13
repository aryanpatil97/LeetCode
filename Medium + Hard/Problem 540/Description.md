Problem 540 — Single Element in a Sorted Array

Short statement
In a sorted array where every element appears twice except for one, find the single element in O(log n) time.

Approach
- Binary search using pairing properties: the single element affects pairing indices; use XOR or index parity checks.

Complexity
- Time: O(log n), Space: O(1).

Edge cases
- Small arrays (length 1 or 3).
