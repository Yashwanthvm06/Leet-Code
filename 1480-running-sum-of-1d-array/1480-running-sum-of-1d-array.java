class Solution {
    public int[] runningSum(int[] nums) {
        int check=0;
        int[] sum=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
check+=nums[i];
sum[i]=check;
        }
    return sum;
    }
}