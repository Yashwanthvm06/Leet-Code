class Solution {
    public int pivotIndex(int[] nums) {
        int ts=0;
        for(int number:nums){
            ts+=number;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(leftsum==ts-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}