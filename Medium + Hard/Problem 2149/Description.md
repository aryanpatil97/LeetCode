Problem 2149 — Rearrange Array Elements by Sign

Short statement
Given an array with equal number of positive and negative numbers, rearrange it so that positives and negatives alternate, preserving relative order among positives and among negatives.

Approach
- Two-pass to place positives at even indices and negatives at odd indices (or vice versa). Use extra array for simplicity.

Complexity
- Time: O(n), Space: O(n).

Edge cases
- Zero can be treated as positive or negative depending on spec (here numbers are non-zero in typical problem statements).
