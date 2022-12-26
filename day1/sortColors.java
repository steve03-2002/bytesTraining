class Solution {
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0,i=0;
        int r=nums.length-1;
        while(i<=r){
            if(nums[i]==2){
                swap(nums,r,i);
                r--;
            }
            if(nums[i]==0){
                swap(nums,l,i);
                l++;
            }
            if(nums[i]!=2)
            i++;
        }
    }
}
