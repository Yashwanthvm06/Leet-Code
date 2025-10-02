class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> li = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                li.add(nums[j]);
            }
        }
        return li;
    }
    public void swap(int [] nums,int from, int to){
        int temp=nums[from];
        nums[from]=nums[to];
        nums[to]=temp;
    }
}