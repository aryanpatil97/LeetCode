public class Solution {
    private boolean[][] rows = new boolean[9][9];
    private boolean[][] cols = new boolean[9][9];
    private boolean[][] boxes = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch != '.') {
                    int d = ch - '1';
                    int b = (r / 3) * 3 + (c / 3);
                    rows[r][d] = cols[c][d] = boxes[b][d] = true;
                }
            }
        }
        backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int r, int c) {
        if (r == 9) return true;
        if (c == 9) return backtrack(board, r + 1, 0);
        if (board[r][c] != '.') return backtrack(board, r, c + 1);
        int b = (r / 3) * 3 + (c / 3);
        for (int d = 0; d < 9; d++) {
            if (!rows[r][d] && !cols[c][d] && !boxes[b][d]) {
                board[r][c] = (char) ('1' + d);
                rows[r][d] = cols[c][d] = boxes[b][d] = true;
                if (backtrack(board, r, c + 1)) return true;
                board[r][c] = '.';
                rows[r][d] = cols[c][d] = boxes[b][d] = false;
            }
        }
        return false;
    }
}
