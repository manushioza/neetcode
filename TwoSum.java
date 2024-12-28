class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] indices = new int[2];
      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++){
            if ((i != j) && ((nums[i] + nums[j]) == target)){
                indices[0] = j;
                indices[1] = i;
            }
        }
      }

      return indices;
    }
}
