/*
 * Key Concept for 2091. Removing Minimum and Maximum From Array:
 * 
 * 1. Find the 0-based indices of the minimum and maximum elements.
 * 2. Let left = min(minIdx, maxIdx) and right = max(minIdx, maxIdx).
 * 3. Calculate deletions for the 3 valid scenarios to remove both elements:
 *    - Both from Front:  right + 1
 *    - Both from Back:   n - left
 *    - From Both Sides:  (left + 1) + (n - right)
 * 4. Return the minimum of all 3 costs: Math.min(front, Math.min(back, both)).
 */

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
