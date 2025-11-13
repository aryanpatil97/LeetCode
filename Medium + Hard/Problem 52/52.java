// Solution for LeetCode 52. N-Queens II

class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        // Use backtracking with bitmasks for columns and diagonals
        backtrack(n, 0, 0, 0);
        return count;
    }

    private void backtrack(int n, int cols, int diags, int antiDiags) {
        if (cols == (1 << n) - 1) {
            // all n queens placed
            count++;
            return;
        }

        int available = (~(cols | diags | antiDiags)) & ((1 << n) - 1);
        while (available != 0) {
            int pick = available & -available; // rightmost 1
            available -= pick;
            backtrack(n, cols | pick, (diags | pick) << 1, (antiDiags | pick) >> 1);
        }
    }
}
