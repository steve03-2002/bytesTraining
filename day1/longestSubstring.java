class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> map = new HashMap<>();

      int right = 0, left = 0;
      int n = String.length();
      int len = 0;

      while(right<n){
          if(map.containsKey(S.CharAt(right)))
          left = Math.max(map.get(S.CharAt(right))+1,j);

          map.put(S.CharAt(right),right);
          len = Math.max(len,right-left+1);
          right++;
      }
      return len;
    }
}