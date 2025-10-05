# 1266. Minimum Time Visiting All Points

Given a list of points, return the minimum time to visit all points in order.

**Example 1:**
```
Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
```

**Constraints:**
- 1 <= points.length <= 100
- points[i].length == 2

**Approach:**
- For each consecutive pair, add max of x and y distance.