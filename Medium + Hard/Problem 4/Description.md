# 4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Constraints:
- The overall run time complexity should be O(log (m+n)).

Solving pattern and why:
- Use binary search on the smaller array to partition both arrays so that left partitions contain half of the combined elements.
- This yields O(log min(m,n)) time which meets the constraint; merging would be O(m+n) and too slow for large inputs.

Approach:
- Binary search for a partition index i in nums1; compute j so that left sizes sum = (m+n+1)/2.
- Ensure max(left1) <= min(right2) and max(left2) <= min(right1). If not, move the partition.
- Compute median from boundary values.

Edge cases:
- empty one array (median is median of other)
- different lengths and odd/even combined length
