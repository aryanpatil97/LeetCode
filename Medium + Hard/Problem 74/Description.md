Problem 74 — Search a 2D Matrix

Short statement
Given an m x n matrix where each row is sorted left-to-right and the first integer of each row is greater than the last integer of the previous row, determine if a target value exists in the matrix.

Approach
- Binary search per row (or treat the matrix as a flattened sorted array and do a single binary search). This implementation binary-searches each row efficiently.

Complexity
- Time: O(m log n) using per-row binary search (or O(log(mn)) if flattened), Space: O(1).

Edge cases
- Empty matrix, single-row or single-column matrices.
