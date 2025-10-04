class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum=0;
        int [] count=new int[101];
        for(int i:nums){
            sum+=count[i]++;
        }
        return sum;
    }
}