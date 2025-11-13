Problem 275 — H-Index II

Short statement
Given a sorted list of citations, compute the h-index in O(log n) time.

Approach
- Binary search on possible h values using the sorted citations array.

Complexity
- Time: O(log n), Space: O(1).

Edge cases
- All zeros, very large citations.
