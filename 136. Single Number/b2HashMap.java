class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            mp.put(key,mp.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer,Integer> it: mp.entrySet())
        {
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}
