# 292. Nim Game

You are playing the following Nim Game with your friend: There is a heap of stones on the table, each turn you remove 1 to 3 stones. The player who removes the last stone wins. Given n, return true if you can win the game assuming both players play optimally.

**Example 1:**
```
Input: n = 4
Output: false
```

**Constraints:**
- 1 <= n <= 2^31 - 1

**Approach:**
- You can win if n % 4 != 0.