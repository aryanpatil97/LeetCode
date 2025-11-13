Problem 670 — Maximum Swap

Short statement
Given a non-negative integer num, you may swap two digits at most once to get the maximum valued number; return the maximum possible value.

Approach
- Greedy with one pass to record the last index of each digit; then find the leftmost digit that can be swapped with a larger digit appearing later.

Complexity
- Time: O(d) where d is number of digits (<= 10), Space: O(d).

Edge cases
- Single-digit numbers, repeated digits.
