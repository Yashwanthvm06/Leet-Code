class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int n=nums.length;
        int[] result=new int[n];
        int r=n-1;
        int index=n-1;
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                result[index--]=left;
                l++;
            }
            else{
                result[index--]=right;
                r--;
            }
        }
    return result;
    }

}