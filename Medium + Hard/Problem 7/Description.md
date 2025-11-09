# 7. Reverse Integer

Given a 32-bit signed integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Solving pattern and why:
- Use arithmetic to reverse digits while checking for overflow on the fly. This is O(log10(x)) time and O(1) space.

Approach:
- Pop digits from x by modulus/division, push into result by multiply-add while checking overflow before each multiply/add.

Edge cases:
- negative numbers
- overflow cases like 1534236469
