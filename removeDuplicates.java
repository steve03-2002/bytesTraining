class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length,jdx=0;
        for(int i=0;i<len-1;++i){
            if(nums[i]!=nums[i+1]){
                nums[jdx++]=nums[i];
            }
        }
        nums[jdx++]=nums[len-1];
        return jdx;
    }
