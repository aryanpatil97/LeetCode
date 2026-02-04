Problem: Divide Two Integers (LeetCode 29)

Statement: Divide two integers without using multiplication, division and mod operators. Return the quotient truncated toward zero. Handle overflow.

Approach: Bit shifting subtraction (long for safety).
- Work with absolute values and track sign
- Repeatedly subtract the largest shifted divisor from dividend
- Accumulate quotient using powers of two

Why this pattern: Binary long division via shifts yields O(log n) operations and avoids forbidden operators.

Complexity:
- Time: O(log(|dividend|))
- Space: O(1)

Edge Cases:
- Overflow for Integer.MIN_VALUE / -1 (clamp to Integer.MAX_VALUE)
- Dividing by 0 not considered (per constraints)
