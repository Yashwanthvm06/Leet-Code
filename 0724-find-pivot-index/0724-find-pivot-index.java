class Solution {
    public int pivotIndex(int[] nums) {
        int ts=0;
        for(int number:nums){
            ts+=number;
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            if(lsum==ts-lsum-nums[i]){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}