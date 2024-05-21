class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int upperBound(long arr[], int n, long x)
    {
        int high=n-1,low=0,pos=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                pos = mid;
                high=mid -1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
        }
        return pos;
            
    }
    
}
