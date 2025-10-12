public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] cnt = new int[26];
        for (char c : chars.toCharArray()) cnt[c-'a']++;
        int res = 0;
        for (String w : words) {
            int[] cur = cnt.clone();
            boolean ok = true;
            for (char c : w.toCharArray()) {
                if (--cur[c-'a'] < 0) { ok = false; break; }
            }
            if (ok) res += w.length();
        }
        return res;
    }
}
