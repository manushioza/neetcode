class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int j = numbers.length - 1;
        int sum = 0;
        for(int i = 0; i < numbers.length; ){
            sum = numbers[i] + numbers[j];
            if (sum == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
          
                else if(sum > target){
                    j -= 1;
                }
                else{
                    i += 1;
                }
            }
            
        
        return res;
    }
}
