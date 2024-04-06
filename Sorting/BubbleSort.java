
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        recBubble(arr,n);
    }

    static void recBubble(int[] arr,int n){
        if(n==1){
            return;
        }
        int didSwap=0;
        for(int i=0;i<n -1;i++){
            if (arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
            didSwap=1;
        }
       
        }
         if(didSwap==0){
            return;
        }
        recBubble(arr,n-1);
    }
}
