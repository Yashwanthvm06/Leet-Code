class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int [] temp=new int [1001];
        int count=0;
        for(int i:nums1){
            temp[i]=1;
        }
        for(int num:nums2){
            if(temp[num]==1){
                count++;
                temp[num]=2;
            }
        }
        int[] newarr =new int[count];
        int j=0;
        for(int number:nums2){
            if(temp[number]==2){     
           temp[number]=1;
           newarr[j++]=number;
            }
        }
        return newarr;
    }
}