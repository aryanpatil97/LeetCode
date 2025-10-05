# 1232. Check If It Is a Straight Line

Given n coordinates, check if they all lie on a straight line.

**Example 1:**
```
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
```

**Constraints:**
- 2 <= coordinates.length <= 1000
- coordinates[i].length == 2

**Approach:**
- Check the slope between each pair of points.