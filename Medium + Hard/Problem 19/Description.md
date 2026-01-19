Problem: Remove Nth Node From End of List (LeetCode 19)

Statement: Remove the nth node from the end of a singly linked list and return its head.

Approach: Two-pointer (fast/slow).
- Move fast n steps ahead
- Advance both until fast reaches end
- Delete node by skipping it

Why this pattern: Single pass with O(1) extra space, clean and efficient.

Complexity:
- Time: O(L)
- Space: O(1)

Edge Cases:
- Removing head (n equals list length)
- Single-element list
