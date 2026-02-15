Problem: Combination Sum (LeetCode 39)

Statement: Given a set of candidate numbers and a target, find all unique combinations that sum to target. Each number may be used unlimited times.

Approach: Backtracking with index.
- Sort candidates
- DFS accumulating sum; reuse current index to allow unlimited use
- Prune when sum exceeds target

Why this pattern: Backtracking enumerates combinations efficiently with pruning and avoids duplicates via index discipline.

Complexity:
- Time: Exponential in target/candidates
- Space: O(target) depth plus output

Edge Cases:
- Candidates with duplicates (sort + index handles duplicates)
