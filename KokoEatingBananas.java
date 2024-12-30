class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int k;
       int lp = 1; 
       int rp = Arrays.stream(piles).max().getAsInt();
       int minK = rp; 
       double totalTimeCount = 0;

       while (lp <= rp){
        k = (rp + lp)/2;
        for(int p:piles){
            totalTimeCount += Math.ceil((double) p/k);
        }
        if(totalTimeCount <= h){
            minK = k;
            rp = k - 1;
        }
        else{
            lp = k + 1;
        }
       }
       return minK;
    }
}
