Problem 852 — Peak Index in a Mountain Array

Short statement
Given a mountain array (strictly increasing then strictly decreasing), return the index of the peak.

Approach
- Binary search comparing mid with mid+1 to find the increasing/decreasing slope; narrow the search until left==right.

Complexity
- Time: O(log n), Space: O(1).

Edge cases
- Small arrays (n>=3 per constraints).
852. Peak Index in a Mountain Array
Solved
Medium
Topics
premium lock icon
Companies
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.