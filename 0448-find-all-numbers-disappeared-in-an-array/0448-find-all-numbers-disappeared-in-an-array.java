class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
        if(nums[i]<=nums.length && nums[i]!=nums[correct])
        {
swap(nums,i,correct);
    }
    else{
        i++;
    }
    }
    List<Integer> ya=new ArrayList<>();
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){ya.add(j+1);}
    }
    return ya;
}
public void swap(int[] arr,int f,int s){
    int temp=arr[f];
    arr[f]=arr[s];
    arr[s]=temp;
}
}