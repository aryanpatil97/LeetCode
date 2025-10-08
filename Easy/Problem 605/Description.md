# 605. Can Place Flowers

Given a flowerbed (represented as an array of 0s and 1s), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

**Example 1:**
```
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
```

**Constraints:**
- 1 <= flowerbed.length <= 2 * 10^4
- flowerbed[i] is 0 or 1
- There are no two adjacent flowers in the initial flowerbed.

**Approach:**
- Iterate through the array, plant flowers greedily where possible.