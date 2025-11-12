Problem 2161 — Partition Array According to Given Pivot

Short statement
Given an array and a pivot value, reorder elements so that elements less than pivot come first, then equal to pivot, then greater than pivot, preserving relative order in each partition.

Approach
- Stable partition using three passes: collect < pivot, == pivot, > pivot into result array.

Complexity
- Time: O(n), Space: O(n).

Edge cases
- All elements equal to pivot, no elements less/greater than pivot.
