Problem 1402 — Reducing Dishes

Short statement
Given an array satisfaction[] of dish satisfaction values, choose a subset and order to maximize the sum of time * satisfaction for all dishes (time starts at 1 and increments per dish cooked).

Approach
- Greedy after sorting: sort satisfaction ascending, iterate from the end accumulating suffix sums; add the suffix when it increases total benefit.

Complexity
- Time: O(n log n) for sorting.
- Space: O(1).

Edge cases
- All negative values (answer 0), single element.
