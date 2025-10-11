import java.util.*;
public class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> seen = new HashSet<>();
        int x = 0, y = 0;
        seen.add("0,0");
        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            String key = x + "," + y;
            if (!seen.add(key)) return true;
        }
        return false;
    }
}
