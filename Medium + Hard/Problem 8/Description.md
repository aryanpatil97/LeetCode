# 8. String to Integer (atoi)

Implement the myAtoi(string s) function which converts a string to a 32-bit signed integer (similar to C/C++'s atoi).

Rules:
- Read in and ignore leading whitespace.
- Optional plus/minus sign.
- Read digits until the next non-digit or end of string.
- Clamp to 32-bit signed integer range on overflow.

Solving pattern and why:
- Linear scan with state handling for whitespace, sign, and digits; check overflow before appending each digit.
- Time O(n), space O(1).
