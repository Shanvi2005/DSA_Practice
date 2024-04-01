class Solution {
    public int[] twoSum(int[] books, int target) {
        int n = books.length;
        int [] result = new int [2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = books[i]+books[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
