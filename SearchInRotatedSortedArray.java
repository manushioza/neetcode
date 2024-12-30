class Solution {
    public int search(int[] nums, int target) {
        int lp = 0; 
        int rp = nums.length - 1;
        int mid = 0;
        int res = -1;

        //while lp !=rp -> ie. not pointing to same index, figure out pivot point
        // do this by halving the array each time to figure out pivot point
        while (lp != rp){
            mid = (lp + rp) / 2;
            if(nums[mid] > nums[rp]){
                lp = mid + 1;
            }
            else{
                rp = mid;
            }
        }
        //first check lhs [0 to pivot point] -> if target found, return index
        int checkLeft = binarySearch(nums, target, 0, lp - 1);
        if (checkLeft != -1){
            return checkLeft;
        }
        //if target not found, check rhs [pivot point to end]
        else{
            return binarySearch(nums, target, lp, nums.length - 1);
        }
    }

    // regular bs function
    public int binarySearch(int[] nums, int target, int lp, int rp){
        int index = -1;
        while(lp <= rp){
            int mid = (lp + rp) / 2;
            if(nums[mid] > target){
                rp = mid - 1;
            }
            else if(nums[mid] < target){
                lp = mid + 1;
            }
            else{
                index = mid;
                break;
            }
        }
        return index;
    }
}
