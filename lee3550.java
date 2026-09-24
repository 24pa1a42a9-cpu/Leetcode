
//You are given an integer array nums.Return the smallest index i such that the sum of the digits of nums[i] is equal to i.If no such index exists, return -1.

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sod(nums[i])==i){
                return i;    
            }
        }
        return -1;
    }
    public int sod(int n){
        int r=0;
        while(n>0){
            r+=n%10;
            n=n/10;
        }
        return r;
    }
}
