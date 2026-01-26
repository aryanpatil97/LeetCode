import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(new StringBuilder(), 0, 0, n, res);
        return res;
    }
    private void backtrack(StringBuilder sb, int open, int close, int n, List<String> res) {
        if (sb.length() == 2 * n) { res.add(sb.toString()); return; }
        if (open < n) { sb.append('('); backtrack(sb, open + 1, close, n, res); sb.deleteCharAt(sb.length() - 1); }
        if (close < open) { sb.append(')'); backtrack(sb, open, close + 1, n, res); sb.deleteCharAt(sb.length() - 1); }
    }
}
