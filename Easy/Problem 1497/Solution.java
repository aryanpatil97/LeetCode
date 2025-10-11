import java.util.*;
public class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] cnt = new int[k];
        for (int a : arr) cnt[((a % k) + k) % k]++;
        if (cnt[0] % 2 != 0) return false;
        for (int i = 1; i < k; i++) {
            if (cnt[i] != cnt[k - i]) return false;
        }
        return true;
    }
}
