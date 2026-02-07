import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return res;
        int wordLen = words[0].length();
        int total = wordLen * words.length;
        if (s.length() < total) return res;
        Map<String, Integer> need = new HashMap<>();
        for (String w : words) need.put(w, need.getOrDefault(w, 0) + 1);
        for (int offset = 0; offset < wordLen; offset++) {
            Map<String, Integer> window = new HashMap<>();
            int count = 0;
            int left = offset;
            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
                String w = s.substring(right, right + wordLen);
                if (need.containsKey(w)) {
                    window.put(w, window.getOrDefault(w, 0) + 1);
                    count++;
                    while (window.get(w) > need.get(w)) {
                        String lw = s.substring(left, left + wordLen);
                        window.put(lw, window.get(lw) - 1);
                        left += wordLen;
                        count--;
                    }
                    if (count == words.length) {
                        res.add(left);
                        String lw = s.substring(left, left + wordLen);
                        window.put(lw, window.get(lw) - 1);
                        left += wordLen;
                        count--;
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }
        return res;
    }
}
