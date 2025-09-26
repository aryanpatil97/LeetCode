// Solution for LeetCode 275. H-Index II

class Solution {
    public int hIndex(int[] citations) {
        int l=0;
        int r=citations.length;
        while(l<r){
            int mid = (l+r+1)>>>1;
            if(citations[citations.length-mid]>=mid) l=mid;
            else r=mid-1;
        }
        return l;
    }
}