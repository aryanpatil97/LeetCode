Problem: 3Sum Closest (LeetCode 16)

Statement: Given `n` integers, find three integers such that the sum is closest to a given target.

Approach: Sort + two-pointer.
- Sort array
- For each index i, two-pointer from both ends to approach target
- Track best absolute difference and sum

Why this pattern: Sorting allows monotonic two-pointer movement to converge toward target efficiently.

Complexity:
- Time: O(n^2)
- Space: O(1)

Edge Cases:
- Multiple sums equally close
- Small arrays (n=3)
