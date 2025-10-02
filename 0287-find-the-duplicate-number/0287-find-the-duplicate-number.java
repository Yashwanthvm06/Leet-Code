class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]<i+1){
                if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                return nums[i];
            }
            }
            else{
                i++;
            }
        }
        return nums.length;
    }
    public void swap(int [] arr,int from,int to){
        int temp=arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }
}