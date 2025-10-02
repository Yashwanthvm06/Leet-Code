class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
            for(int dup=0;dup<nums.length;dup++){
                if(nums[dup]!=dup+1){
                    return new int[]{nums[dup],dup+1};
                }
        }
return new int []{-1,-1};
    }
    public void swap(int [] arr,int from ,int to){
        int temp=arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }
}