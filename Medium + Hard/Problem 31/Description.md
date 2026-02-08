Problem: Next Permutation (LeetCode 31)

Statement: Rearranges numbers into the lexicographically next greater permutation of numbers. If such arrangement is not possible, it must be rearranged as the lowest possible order.

Approach: Find pivot, swap, reverse suffix.
- Find first decreasing index i from the right
- Find rightmost element greater than nums[i], swap
- Reverse the suffix after i

Why this pattern: Follows lexicographic permutation properties to get next in O(n).

Complexity:
- Time: O(n)
- Space: O(1)

Edge Cases:
- Entirely non-increasing array (reverse whole)
