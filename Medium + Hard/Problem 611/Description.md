Problem 611 — Valid Triangle Number

Short statement
Given an integer array, count the number of triplets that can form triangle side lengths.

Approach
- Sort array and use two pointers: fix the largest side and count pairs (i,j) with nums[i] + nums[j] > nums[k].

Complexity
- Time: O(n^2), Space: O(1).

Edge cases
- Zeros and insufficient length (<3).
611. Valid Triangle Number
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Example 2:

Input: nums = [4,2,3,4]
Output: 4
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 1000
