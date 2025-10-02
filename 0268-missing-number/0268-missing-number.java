class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[current]){
                swap(nums,i,current);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
return nums.length;
    }
    public void swap(int [] arr,int i,int current){
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}