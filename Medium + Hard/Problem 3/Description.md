# 3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Constraints:
- 0 <= s.length <= 5 * 10^4

Solving pattern and why:
- Use sliding window with two pointers and a map/array to record last seen positions.
- This gives O(n) time and O(min(n, charset)) space which is optimal because we must inspect each character.

Approach:
- Expand the right pointer; when a duplicate is found, move the left pointer to one position after the previous index of that character.
- Keep track of the maximum window length.

Edge cases:
- empty string -> 0
- all unique -> full length
- all same characters -> 1

Example:
- s = "abcabcbb" -> answer 3 ("abc")
