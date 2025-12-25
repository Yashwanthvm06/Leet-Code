class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int holding=0;
        while(s<e){
            int width=e-s;
            int minheight=Math.min(height[s],height[e]);
            holding=Math.max(holding,width*minheight);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return holding;
    }
}