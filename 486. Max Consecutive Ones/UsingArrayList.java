// 6ms
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     ArrayList<Integer> list = new ArrayList<>();
     int c=0;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]==1){
            c++;
        }
        else{
            list.add(c);
            c=0;
        }
     }
     if(nums[nums.length-1]==1){
        c++;
        list.add(c);
     } 
     else{
        list.add(c);
     } 
     return Collections.max(list);
    }
}
