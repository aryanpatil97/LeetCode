Problem: Integer to Roman (LeetCode 12)

Statement: Convert an integer to a Roman numeral.

Approach: Greedy using value-symbol pairs.
- Use descending arrays of values and symbols
- Subtract the largest possible value repeatedly
- Append the corresponding symbols to build the result

Why this pattern: Roman numerals have a canonical greedy representation using subtractive pairs; greedy yields optimal and simple conversion.

Complexity:
- Time: O(1) (bounded by fixed set of symbols)
- Space: O(1)

Edge Cases:
- Subtractive notations like 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD), 900 (CM)
