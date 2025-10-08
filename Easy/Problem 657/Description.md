# 657. Robot Return to Origin

Given a string moves, return true if the robot returns to the origin after all moves.

**Example 1:**
```
Input: moves = "UD"
Output: true
```

**Constraints:**
- 1 <= moves.length <= 10^4
- moves only contains 'U', 'D', 'L', 'R'

**Approach:**
- Track x and y coordinates, check if both are zero at the end.