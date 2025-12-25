class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int s=i+1;
            int e=nums.length-1;
            while(s<e){
            int cs=nums[i]+nums[s]+nums[e];
            if(Math.abs(cs-target)<Math.abs(closest-target)){
                closest=cs;
            }
            if(cs<target) s++;
            else if(cs>target) e--;
            else return cs;
            }
        }
        return closest;
    }
}