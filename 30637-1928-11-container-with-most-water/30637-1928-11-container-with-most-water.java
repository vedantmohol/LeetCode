class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int leftPointer=0, rightPointer = height.length-1;
        int width = height.length-1;

        while(leftPointer<rightPointer){
            int water = Math.min(height[leftPointer],height[rightPointer]) * width;
            maxWater = Math.max(maxWater,water);

            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }
            width--;
        }
        return maxWater;
    }
}