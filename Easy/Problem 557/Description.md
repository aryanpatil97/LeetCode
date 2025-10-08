# 557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**
```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
```

**Constraints:**
- 1 <= s.length <= 5 * 10^4
- s contains printable ASCII characters.

**Approach:**
- Split the string by spaces, reverse each word, and join.