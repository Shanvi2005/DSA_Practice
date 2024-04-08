public class Solution {
    public static void insertionSort(int[] arr, int size) {
        recInsertion(arr,1);
          
       }
    
    static void recInsertion(int []arr,int n){
        if(n==arr.length){
            return;
        }
        int j=n;
        while( (j>0)&&(arr[j]<arr[j-1])){
                   int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1] = temp;
                   j--;
               
           }
        recInsertion(arr, n+1);

    }
}
