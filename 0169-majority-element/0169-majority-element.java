class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int currnum=0;
        for(int num:nums){
        if(count==0) currnum=num;
        count = (num==currnum) ? count+1:count-1;

    }
    return currnum;
    }
}