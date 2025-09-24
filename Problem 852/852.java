// Solution for LeetCode 852. Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l =0;
        int r=arr.length-1;
        while(l<r){
            final int mid = (l+r)/2;
            if(arr[mid]>=arr[mid+1]) r=mid;
            else l = mid+1;
        }
        return l;
    }
}
