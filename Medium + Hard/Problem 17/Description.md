Problem: Letter Combinations of a Phone Number (LeetCode 17)

Statement: Given a string containing digits from 2-9, return all possible letter combinations that the number could represent.

Approach: Backtracking.
- Map each digit to its letters
- DFS to build strings by choosing one letter per digit

Why this pattern: Exhaustive combination generation fits DFS/backtracking cleanly.

Complexity:
- Time: O(4^n * n) worst-case
- Space: O(n) recursion depth plus output

Edge Cases:
- Empty input returns empty list
