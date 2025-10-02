class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
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
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    li.add(nums[index]);
                }
            }
      return li;
      }
    public void swap(int []nums,int f,int s){
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
   
}