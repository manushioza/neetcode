class Solution {

    public int search(int[] nums, int target) {
        //set index as -1 bc you haven't found index of target yet
        int index = -1; 
        //left pointer starts at first index
        int lp = 0; 
        //right pointer starts at last index
        int rp = nums.length - 1;

        //While lp <= rp (they have switched sides)
        while(lp <= rp){
            //get half way index of arr
            int cp = lp + ((rp - lp) / 2);
            //if val at cp is less than target -> target is in second half -> move lp to cp + 1 index
            if(nums[cp] < target){
                lp = cp + 1;
            }
            //otherwise target is in first half -> move rp to cp - 1 index
            else if (nums[cp] > target){
                rp = cp - 1;
            }
            //if =, then set index to cp and break
            else{
                index = cp;
                break;
            }
        }
        return index;
        
    }

  
}

