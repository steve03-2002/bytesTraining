class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> li=new ArrayList<>();
        int ans[]=new int[nums1.length],p=0;
        for(int i:nums2) li.add(i);
        for(int i:nums1){
            int fl=0;
            int idx=li.indexOf(i);
            for(int j=idx;j<nums2.length;++j){
                if(nums2[idx]<nums2[j]){fl++; ans[p++]=nums2[j]; break;}
            }
            if(fl==0) ans[p++]=-1;
        }
        return ans;
    }
}
