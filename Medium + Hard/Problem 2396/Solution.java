class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2;i<=n-2;++i){
            String pal = Integer.toString(n,i);
            int l=0;
            int r=pal.length()-1;
            while(l<r){
                if(pal.charAt(l)!=pal.charAt(r)){
                    return false;
                    }
                l++;
                r--;
            }
        }
        return true;
    }
}
