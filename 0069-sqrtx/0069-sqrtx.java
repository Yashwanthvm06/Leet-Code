class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int start=2;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( (x== mid*mid)){
                return mid;
            }
            if((long) x < (long) mid*mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}