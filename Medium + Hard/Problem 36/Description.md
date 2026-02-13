Problem: Valid Sudoku (LeetCode 36)

Statement: Determine if a 9x9 Sudoku board is valid based on Sudoku rules (no duplicates in rows, columns, and 3x3 boxes). The board may be partially filled.

Approach: Boolean tracking for rows, cols, boxes.
- For each non-'.' char, compute digit index and box index
- Check and set flags for row, col, and box

Why this pattern: Constant-time checks per cell; simple and efficient implementation.

Complexity:
- Time: O(81)
- Space: O(81)

Edge Cases:
- Empty cells '.'
