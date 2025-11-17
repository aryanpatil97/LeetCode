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
