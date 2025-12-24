class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] onlynine=new int[digits.length+1];
        onlynine[0]=1;
        return onlynine;
    }
}