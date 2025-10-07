import java.util.*;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) max = Math.max(max, c);
        List<Boolean> res = new ArrayList<>();
        for (int c : candies) res.add(c + extraCandies >= max);
        return res;
    }
}
