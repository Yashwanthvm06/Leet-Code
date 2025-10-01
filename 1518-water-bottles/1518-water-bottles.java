class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int drunk=(numBottles/numExchange);
            int rem=(numBottles%numExchange);
            total+=drunk;
            numBottles=rem+drunk;
        }
        return total;
    }
}