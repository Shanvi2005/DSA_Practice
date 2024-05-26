class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length -1,pos=-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(nums[mid]==target){
                pos=mid;
                return pos;
            }
            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<=nums[high]){
                if(target<=nums[high] && target>=nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }              
            }
        }
        return pos;
    }
}
