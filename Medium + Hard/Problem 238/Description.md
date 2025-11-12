Problem 238 — Product of Array Except Self

Short statement
Return an array answer such that answer[i] is the product of all elements of nums except nums[i], without using division and in O(n).

Approach
- Left and right product passes: first write prefix products into ans, then multiply suffix products in a reverse pass.

Complexity
- Time: O(n), Space: O(1) extra (ignoring output).

Edge cases
- Zero in input array.
