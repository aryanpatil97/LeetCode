public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int dx2 = coordinates[i][0] - coordinates[0][0];
            int dy2 = coordinates[i][1] - coordinates[0][1];
            if (dy * dx2 != dy2 * dx) return false;
        }
        return true;
    }
}
