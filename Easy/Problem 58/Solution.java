public class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length(), i = len - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        int end = i;
        while (i >= 0 && s.charAt(i) != ' ') i--;
        return end - i;
    }
}
