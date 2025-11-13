Problem 2396 — Strictly Palindromic Number

Short statement
Determine whether an integer n is strictly palindromic: for every base b in [2, n - 2], the string representation of n in base b is a palindrome.

Approach
- Observation: For n >= 4, this condition is never true. So the answer is false for all n >= 4.

Complexity
- Time: O(1) using observation, otherwise O(n^2) checking all bases.

Edge cases
- Small n (n <= 3).
