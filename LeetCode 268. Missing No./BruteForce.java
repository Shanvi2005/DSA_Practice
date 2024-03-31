class Solution {
    public int missingNumber(int[] nums) {
        
        
       for (int i=0;i<=nums.length;i++){
        int c=0;
        for (int j=0;j<nums.length;j++){
            if(i==nums[j]){
                c++;
                break;
            }
        }
        if(c==0){
            return i;
        }
       } return -1;
    }
}
