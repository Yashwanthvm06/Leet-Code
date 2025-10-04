class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int num : candies)
        {
            if(num>max)
            {
                max=num;
            }
        }
        List<Boolean> res=new ArrayList<>();
        for(int i : candies)
        {
        if(i+extraCandies>=max) res.add(true);
        else res.add(false);}
     return res;
    }
    
}