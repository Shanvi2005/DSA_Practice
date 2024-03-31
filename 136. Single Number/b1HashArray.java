class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int maxi = nums[0];
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
        }
        int [] hash = new int [maxi+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                return i;
            }
        }
        return -1;
    }
}
