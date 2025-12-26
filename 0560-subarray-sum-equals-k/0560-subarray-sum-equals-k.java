class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> find=new HashMap<>();
        find.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(find.containsKey(sum-k)){
                count+=find.get(sum-k);
            }
            find.put(sum,find.getOrDefault(sum,0)+1);
        }
        return count;
    }
}