class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct_pos=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct_pos]){
                swap(nums,i,correct_pos);
            }
            else{
                i++;
            }
        }
        for(int miss=0;miss<nums.length;miss++)
        {
            if(nums[miss]!=miss)
            {
                return miss;
            }
        }
        return nums.length;
    }
    public void swap(int[] arr,int from ,int where){
        int temp=arr[from];
        arr[from]=arr[where];
        arr[where]=temp;
    }
}