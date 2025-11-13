Problem 2807 — Insert Greatest Common Divisors in Linked List

Short statement
Given a singly linked list, insert a node between each pair of nodes containing the gcd of the adjacent node values.

Approach
- Iterate the list, compute gcd of current and next, insert node accordingly.

Complexity
- Time: O(n * log(maxVal)) for gcd computations, Space: O(1) extra.

Edge cases
- Single-node list, zeros.
