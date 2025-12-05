// Solution for LeetCode 151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        // Trim spaces and split on whitespace (one or more spaces)
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; --i) {
            if (parts[i].length() == 0) continue;
            sb.append(parts[i]);
            if (i != 0) sb.append(' ');
        }
        return sb.toString();
    }
}
