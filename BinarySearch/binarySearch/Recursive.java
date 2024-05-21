class Solution {
    public int search(int[] nums, int target) {
       return Bsearch(nums,nums.length-1,0,target);
      
    }
    public int Bsearch(int[]arr,int high,int low,int target){
        if (low>high){
            return -1;
        }
        int mid = (high +low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            return Bsearch(arr,mid-1,low,target);
        }
        else{
            return Bsearch(arr,high,mid+1,target);
        }

    }
      
}
