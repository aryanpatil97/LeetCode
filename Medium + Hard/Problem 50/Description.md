# 50. Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Solving pattern and why:
- Use fast exponentiation (binary exponentiation). This computes powers in O(log n) time by squaring and halving the exponent.
- Handle negative exponents by reciprocation; handle n = Integer.MIN_VALUE carefully by using a long.

Approach:
- Convert exponent to long to avoid overflow when negating Integer.MIN_VALUE.
- Repeatedly square x and multiply to result when current bit is 1.