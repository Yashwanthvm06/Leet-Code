class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          int present=target-nums[i];
          if(mp.containsKey(present))
          {
            return new int[]{mp.get(present),i};
          }
          mp.put(nums[i],i);
        }
        return new int[] {};
    }
}