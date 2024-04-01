// 10/11 cases CN, Leetcode issues..

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n =nums.length;
        int len =0;
        for(int i=0;i<n;i++){
            long sum =0; 
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
