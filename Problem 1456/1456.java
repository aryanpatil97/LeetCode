// Solution for LeetCode 1456. Maximum Number of Vowels in a Substring of Given Length

class Solution {
    public int maxVowels(String s, int k) {
        char[] ch = s.toCharArray();
        int i = 0, j = 0, cnt = 0, max = 0;
        
        while(i < ch.length && i - j < k){
            if(isVowel(ch[i])) cnt++;
            max = Math.max(max, cnt);
            i++;
        }

        while(i < ch.length){
            if(isVowel(ch[j++])) cnt--;
            if(isVowel(ch[i])) cnt++;
            max = Math.max(max, cnt);
            i++;
        }
        return max;

    }
    private boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}