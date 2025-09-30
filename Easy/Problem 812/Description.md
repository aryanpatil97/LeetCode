# 812. Largest Triangle Area

Given an array of points on the X-Y plane, find the area of the largest triangle that can be formed by any three of the points.

**Example 1:**
```
Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2.0
```

**Constraints:**
- 3 <= points.length <= 50
- -50 <= points[i][j] <= 50
- All given points are unique.

**Approach:**
- Iterate through all combinations of three points.
- Use the shoelace formula to calculate the area of the triangle formed by each triplet.
- Track and return the maximum area found.
