class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> s = new Stack<Integer>();
        int j = 0;
        for(int i = 0; i < temperatures.length; i++){
            j = i + 1;
            s.clear();
            while(j != temperatures.length){
            s.push(temperatures[j]);
            if(temperatures[i] < temperatures[j]){
                result[i] = s.size();
                break;
            }
          
                j++;
            
            
            }
            
        }
        return result;
    }
}
