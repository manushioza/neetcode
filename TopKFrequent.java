class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        int temp = 0;
        int max = 0;
        int index = 0;
        int[] final_arr = new int[k]; 
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) == null){
                hm.put(nums[i], 1);
            }
            else{
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }

      

            while(temp != k){
                for(int i:hm.keySet()){
                    if (hm.get(i) >= max){
                       
                        index = i;
                        max = hm.get(i);
                    }
                }

                final_arr[temp] = index;
                hm.remove(index);
                temp++;
                max = 0;
            }

      return final_arr;
        
    } 
}
