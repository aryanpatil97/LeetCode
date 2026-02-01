Problem: Sudoku Solver (LeetCode 37)

Statement: Solve a 9x9 Sudoku puzzle by filling empty cells with digits 1-9 to satisfy Sudoku constraints.

Approach: Backtracking with constraint pruning.
- Track row, column, and box usage with boolean arrays
- DFS to fill cells, trying digits and backtracking on conflicts

Why this pattern: Exhaustive search with pruning efficiently solves typical Sudoku instances.

Complexity:
- Time: Exponential worst-case, fast in practice with pruning
- Space: O(1) extra beyond board and flags

Edge Cases:
- Multiple solutions (problem guarantees a solution)
