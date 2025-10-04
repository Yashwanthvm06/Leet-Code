class Solution {
    public int maxArea(int[] height) {
        int can_hold=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            can_hold=Math.max(can_hold,(end-start)*Math.min(height[start],height[end]));
            if(height[start]<height[end]){start++;}
            else{
                end--;
            }
        }
        return can_hold;
    }
}