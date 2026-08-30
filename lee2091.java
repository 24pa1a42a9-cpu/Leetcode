class Solution {
    public int minimumDeletions(int[] nums) {
        int f=0;
        int b=0;
        int bo=0;
        int n=nums.length;
        int ma=-100000;
        int mi=100000;
        int Ma=0;
        int Mi=0;
        for(int i=0;i<n;i++){
           if(nums[i]>ma){
            ma=nums[i];
            Ma=i+1;
           }
           if(nums[i]<mi){
            mi=nums[i];
            Mi=i+1;
           }
       }
       if(Mi>Ma){
        f=Mi;
        b=n-Ma+1;
        bo=n-Mi+1+Ma;
       }
       else if(Mi<Ma){
        f=Ma;
        b=n-Mi+1;
        bo=Mi+n-Ma+1;
       }
       else{
        return 1;
       }
       return Math.min(f ,(Math.min(b,bo)));

    }
}
//# completely satisfied!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  own solution with 100% accceptence #medium range one
