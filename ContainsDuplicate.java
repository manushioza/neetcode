
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dupe = false;
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if (arr.get(nums[i]) == null){
                arr.put(nums[i], 1);
            }
            else{
                dupe = true;
                break;
            }
        }

    return dupe;
    }
}
