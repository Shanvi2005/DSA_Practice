class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        Arrays.sort(arr);
        int a = getFloor(arr,n,x);
        int b= getCeil(arr,n,x);
        return new Pair(a,b);
    }
    
    int getFloor(int[] arr,int n, int x){
        int low=0,high=n-1,no=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
                no=arr[mid];
                low=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return no;
    }
    
    int getCeil(int[] arr,int n,int x){
        int low=0,high=n-1,no=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                no=arr[mid];
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return no;
    }
}

