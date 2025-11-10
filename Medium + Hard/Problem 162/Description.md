Problem 162 — Find Peak Element

Short statement
Given an array where nums[i] != nums[i+1], find an index of a peak element (greater than neighbors).

Approach
- Binary search: compare mid with mid+1 to decide which side contains a peak.

Complexity
- Time: O(log n), Space: O(1).

Edge cases
- First or last element is a peak.
