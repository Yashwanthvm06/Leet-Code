class Solution {
    public int removeElement(int[] nums, int val) {
        int location=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[location]=nums[i];
                location++;
                }
        }
        return location;
    }
}