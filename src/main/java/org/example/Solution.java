package org.example;

public class Solution {
    /**
     * Calculates the maximum area of water that can be held by two vertical lines and the x-axis.
     *
     * @param height An array of integers representing the heights of the vertical lines.
     * @return The maximum area of water that can be held.
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;

        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int tempHeight = Math.min(height[left], height[right]);
            int tempWidth = right - left;
            int tempWater = tempHeight * tempWidth;

            water = Math.max(water, tempWater);

            if (leftHeight < rightHeight) {
                while(left<right && leftHeight >= height[left]){
                    left++;
                }
            } else {
                while(left<right && rightHeight >= height[right]){
                    right--;
                }
            }
        }

        return water;
    }
}
