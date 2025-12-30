// Solution for LeetCode 765. Couples Holding Hands

class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length / 2;
        UnionFind uf = new UnionFind(n);

        // For each seat-pair, connect their couples
        for (int i = 0; i < row.length; i += 2) {
            int c1 = row[i] / 2;
            int c2 = row[i + 1] / 2;
            uf.union(c1, c2);
        }

        // Count unique connected components
        return n - uf.getCount();
    }
}

class UnionFind {
    int[] parent;
    int count;

    UnionFind(int n) {
        parent = new int[n];
        count = n;
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int x, int y) {
        int rootX = find(x), rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
            count--;
        }
    }

    int getCount() {
        return count;
    }
}
