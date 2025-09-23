// Solution for LeetCode 151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String ans ="";
        String[] a =s.strip().split("\\W+");
        int l = a.length;
        if(l==1) return a[0];
        for(int i=l-1;i>0;--i) ans+=a[i]+" ";
        return ans + a[0];
    }
}
