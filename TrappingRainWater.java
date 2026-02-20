//LeetCode Problem
// https://leetcode.com/problems/trapping-rain-water/description/

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //Calculate left max height
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate right max height
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=(n-2); i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterlevel = min(leftMax boundary, rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = (waterlevel - height) * width , (weidth = 1, given)
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
