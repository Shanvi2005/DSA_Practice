public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int maxi = 0;
        for(int i=0;i<a.length;i++){
            int c =0;
           long sum =0;
            for(int j=i;j<a.length;j++){
             if(sum<k){
                 sum+=a[j];
                 c++;
             }
             if(sum==k){
                 if(j<a.length-1){
                 if(a[j+1]==0){
                     c++;
                 }}
                 maxi=Math.max(maxi,c); 
                 break;
             }
             if(sum>k) {
                 break;
             }
            }
        }
        return maxi;
    }
}
