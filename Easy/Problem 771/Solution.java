import java.util.*;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) set.add(c);
        int count = 0;
        for (char c : stones.toCharArray()) if (set.contains(c)) count++;
        return count;
    }
}
