// Solution for LeetCode 443. String Compression

class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for(int i = 0;i<chars.length;){
            char letter = chars[i];
            int count = 0;
            while(i<chars.length&&chars[i]==letter){
                ++count;
                ++i;
            }
            chars[ans++]=letter;
            if(count>1){
                for (char c : String.valueOf(count).toCharArray()) chars[ans++]=c;
            }
        }
        return ans;
    }
}
