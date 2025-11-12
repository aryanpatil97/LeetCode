Problem 189 — Rotate Array

Short statement
Rotate the array to the right by k steps in-place.

Approach
- Reverse the whole array, reverse first k elements, then reverse the remaining elements (three-reverse trick).

Complexity
- Time: O(n), Space: O(1).

Edge cases
- k can be larger than n; empty array.
