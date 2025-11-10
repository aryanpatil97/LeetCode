Problem 1456 — Maximum Number of Vowels in a Substring of Given Length

Short statement
Given a string s and integer k, find the maximum number of vowels in any substring of length k.

Approach
- Sliding window: maintain count of vowels in current window of size k and slide across string updating count and maximum.

Complexity
- Time: O(n), Space: O(1).

Edge cases
- k >= s.length(), all vowels, no vowels.
