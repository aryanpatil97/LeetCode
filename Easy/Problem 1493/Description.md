# 1493. Longest Subarray of 1's After Deleting One Element

Given a binary array nums, return the length of the longest subarray containing only 1's after deleting one element.

Approach:
- Use sliding window tracking number of zeros (<=1).

Constraints:
- 1 <= nums.length <= 10^5