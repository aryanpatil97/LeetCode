# 1492. The kth Factor of n

Given two positive integers n and k, return the k-th factor of n. If n has fewer than k factors, return -1.

Approach:
- Iterate up to sqrt(n) to collect factors in order, then pick the k-th.

Constraints:
- 1 <= k <= n <= 1000