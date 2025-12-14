class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    public void helper(char[] n,int s,int e){
        if(s>=e) return;
        char temp=n[s];
        n[s]=n[e];
        n[e]=temp;
        helper(n,s+1,e-1);
    }
}