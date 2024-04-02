class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       int[] ans = new int[2];
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int i=0;i<n;i++){
        int num = nums[i];
        int moreNeeded = target - num;
        if(mp.containsKey(moreNeeded)){
            ans[0]= mp.get(moreNeeded);
            ans[1] = i;
        }
        mp.put(nums[i],i);
       } 
       return ans;
    }
}
