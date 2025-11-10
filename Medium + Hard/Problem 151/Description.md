Problem 151 — Reverse Words in a String

Short statement
Given a string s, reverse the order of words. Remove leading/trailing spaces and reduce multiple spaces between words to a single space.

Approach
- Split on whitespace and join tokens in reverse order. Or parse manually to avoid extra allocations.

Complexity
- Time: O(n), Space: O(n) for tokens (or O(1) extra if done in-place with two-pass).

Edge cases
- Only spaces, single word, punctuation.
