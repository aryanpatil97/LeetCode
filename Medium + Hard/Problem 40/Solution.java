import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] cand, int remain, int start, List<Integer> path, List<List<Integer>> res) {
        if (remain == 0) { res.add(new ArrayList<>(path)); return; }
        for (int i = start; i < cand.length; i++) {
            if (i > start && cand[i] == cand[i - 1]) continue;
            int v = cand[i];
            if (v > remain) break;
            path.add(v);
            backtrack(cand, remain - v, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
