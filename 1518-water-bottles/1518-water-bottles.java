class Solution {
    public int numWaterBottles(int nb, int ne) {
       int total=nb;
        while(nb>=ne)
        {
         int drunk=(nb/ne);
         int rem=nb%ne;
         total+=drunk;
         nb=drunk+rem;
        }
        return total;
    }
}