class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> li=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max){
                li.add(false);
            }
            else{
                li.add(true);
            }
        }
return li;
    }
}