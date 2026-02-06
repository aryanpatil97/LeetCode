Problem: Substring with Concatenation of All Words (LeetCode 30)

Statement: Given a string s and an array of words of the same length, return all starting indices of substrings that are a concatenation of each word exactly once and without any intervening characters.

Approach: Sliding window with word counts.
- Let wordLen be length of each word; use offsets 0..wordLen-1
- Slide window by wordLen, maintaining counts of current window words
- Shrink when counts exceed desired, record indices when counts match total

Why this pattern: Offset-based sliding avoids re-parsing and handles overlaps efficiently.

Complexity:
- Time: O(n * wordLen)
- Space: O(k) for counts

Edge Cases:
- Repeated words in words list
- Empty words list or string
