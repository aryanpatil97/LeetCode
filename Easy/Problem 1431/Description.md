# 1431. Kids With the Greatest Number of Candies

Given the array candies and the integer extraCandies, return a boolean array indicating if each child can have the greatest number of candies.

**Example 1:**
```
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
```

**Constraints:**
- 2 <= candies.length <= 100
- 1 <= candies[i] <= 100
- 1 <= extraCandies <= 50

**Approach:**
- Find the max, check for each child if candies + extraCandies >= max.