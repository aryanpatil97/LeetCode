// Solution for LeetCode 2545. Sort the Students by Their Kth Score

import java.util.Arrays;

class Solution {
  public int[][] sortTheStudents(int[][] score, int k) {
    Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
    return score;
  }
}
import java.util.Arrays;

class Solution {
  public int[][] sortTheStudents(int[][] score, int k) {
    Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
    return score;
  }
}
