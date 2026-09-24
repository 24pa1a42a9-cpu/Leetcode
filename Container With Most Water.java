/*
 * Problem: Container With Most Water
 * ---------------------------------
 * Given an integer array height where height[i] represents the height of a vertical line at index i.
 * Find two lines that together with the x-axis form a container holding the maximum amount of water.
 * 
 * Approach: Two Pointers (Greedy)
 * 1. Place a pointer at the start (l = 0) and end (r = n - 1) of the array.
 * 2. Calculate the area formed between the two pointers: min(height[l], height[r]) * (r - l).
 * 3. Track and update the maximum area found so far.
 * 4. Move the pointer pointing to the shorter line inward, as moving the taller line's pointer 
 *    could never yield a larger area (width decreases, and height remains constrained by the shorter line).
 * 5. Repeat until the two pointers meet.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxArea(int[] height) {
       int l=0;
       int r=height.length-1;
       int max=0;
       int ans=0;
       while(l<r){
        max=Math.min(height[l],height[r])*(r-l);
        ans=Math.max(ans,max);
        if(height[l]<height[r])
       { l++;}
       else {r--;}
       }
       return ans;
        
    }
}
