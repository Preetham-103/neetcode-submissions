class Solution {
    public int maxArea(int[] height) {
        int wall1 = 0;
        int wall2 = height.length-1;
        int maxArea = 0;
        while(wall1<wall2) {
            int area = Math.min(height[wall1],height[wall2])*(wall2-wall1);
            maxArea = Math.max(maxArea,area);
            if(height[wall1]<height[wall2]){
                wall1++;
            }
            else{
                wall2--;
            }
        }
        return maxArea;
    }
}