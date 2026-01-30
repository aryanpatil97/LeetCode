Problem: Swap Nodes in Pairs (LeetCode 24)

Statement: Given a linked list, swap every two adjacent nodes and return its head. Values may not be modified; only nodes swapped.

Approach: Iterative pointer manipulation with dummy.
- Use a dummy head to simplify edge cases
- For each pair (a,b), rewire pointers: prev->b->a->next

Why this pattern: Iteration avoids recursion overhead and handles all cases cleanly with O(1) extra space.

Complexity:
- Time: O(n)
- Space: O(1)

Edge Cases:
- Odd number of nodes (last remains)
- Single-node list
