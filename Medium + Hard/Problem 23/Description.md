Problem: Merge k Sorted Lists (LeetCode 23)

Statement: Merge k sorted linked lists and return it as one sorted list.

Approach: Min-heap (priority queue).
- Push the head of each list into a min-heap keyed by node value
- Extract-min and push its next until heap empties

Why this pattern: Efficiently selects the smallest among k lists at each step; O(n log k).

Complexity:
- Time: O(N log k) where N = total nodes
- Space: O(k)

Edge Cases:
- Empty lists
- Lists with varying lengths
