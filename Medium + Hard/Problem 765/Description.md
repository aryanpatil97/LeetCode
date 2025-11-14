Problem 765 — Couples Holding Hands

Short statement
Given row of 2n people represented by integers where person i belongs to couple id floor(person/2), compute the minimum number of swaps so that each couple sits together.

Approach
- Model couples as nodes and seats as pairings; union connected couple indices or greedily swap (this implementation uses Union-Find to count components and compute swaps = n - components).

Complexity
- Time: O(n), Space: O(n).

Edge cases
- Already paired couples.
