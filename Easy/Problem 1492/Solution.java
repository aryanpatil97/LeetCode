import java.util.*;
public class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) large.add(n / i);
            }
        }
        if (k <= small.size()) return small.get(k-1);
        int idx = k - small.size() - 1;
        if (idx < 0 || idx >= large.size()) return -1;
        return large.get(large.size() - 1 - idx);
    }
}
