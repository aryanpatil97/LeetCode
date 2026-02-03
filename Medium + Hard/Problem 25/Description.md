Problem: Reverse Nodes in k-Group (LeetCode 25)

Statement: Given a linked list, reverse the nodes of a list k at a time and return its modified list. Nodes remaining at the end fewer than k should remain as is.

Approach: Iterative group reversal.
- Count k nodes ahead; if fewer than k, stop
- Reverse k nodes in-place using pointer flipping
- Connect previous tail to new head and move forward

Why this pattern: In-place reversal yields O(1) extra space and linear time; iterative approach is robust.

Complexity:
- Time: O(n)
- Space: O(1)

Edge Cases:
- k=1 (no change)
- List length not multiple of k
