// Solution for LeetCode 2161. Partition Array According to Given Pivot

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[]=new int[nums.length];
        int i=0;
        for(int e:nums){
            if(e<pivot){
            res[i]=e;
            i++;
    }
}
        for(int e:nums){
            if(e==pivot){
                res[i]=e;
                i++;

            }
        }
        for(int e:nums){
            if(e>pivot){
                res[i]=e;
                i++;

            }
       }
       return res; 
    }
}
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[]=new int[nums.length];
        int i=0;
        for(int e:nums){
            if(e<pivot){
            res[i]=e;
            i++;
    }
}
        for(int e:nums){
            if(e==pivot){
                res[i]=e;
                i++;

            }
        }
        for(int e:nums){
            if(e>pivot){
                res[i]=e;
                i++;

            }
       }
       return res; 
    }
}
