Problem 1887 — Reduction Operations to Make the Array Elements Equal

Short statement
Given an integer array, in one operation you can reduce the largest element to the next largest value. Return the minimum number of operations to make all elements equal.

Approach
- Sort ascending. Iterate from largest to smallest maintaining a counter of distinct greater values encountered; accumulate that counter for each position to get total operations.

Complexity
- Time: O(n log n), Space: O(1) extra.

Edge cases
- All elements already equal.
