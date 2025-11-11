Problem 172 — Factorial Trailing Zeroes

Short statement
Given n, return the number of trailing zeroes in n!.

Approach
- Count factors of 5: sum floor(n/5) + floor(n/25) + floor(n/125) + ...

Complexity
- Time: O(log_5 n), Space: O(1).

Edge cases
- Small n, zero.
