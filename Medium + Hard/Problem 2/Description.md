Problem: Add Two Numbers (LeetCode 2)

Statement: Add two non-empty linked lists representing non-negative integers where digits are stored in reverse order. Return the sum as a linked list in reverse order.

Approach: Iterative addition with carry.
- Traverse both lists simultaneously
- Sum corresponding digits + carry
- Create new nodes for each digit of the result
- Handle remaining carry at the end

Why this pattern: This is the most direct linear-time approach aligned with digit-wise addition. It avoids extra data structures and mirrors grade-school addition.

Complexity:
- Time: O(n + m) for lengths of the lists
- Space: O(1) extra (output list excluded)

Edge Cases:
- Different list lengths
- Final carry producing an extra node
- Zeros and single-node lists
