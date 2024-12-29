class Solution {
    public int maxArea(int[] heights) {
        int area,l,w;
        int max_area = 0;
        
        for(int p1 = 0; p1 < heights.length - 1; p1++){
            for(int p2 = p1 + 1; p2 < heights.length; p2++){
                w = p2 - p1;
                l = Math.min(heights[p1], heights[p2]);
                area = l * w;
               

                if(area > max_area){
                    max_area = area;
                }
            }
           
        }
        return max_area;
    }
}

//NOTES - BRUTE FORCE SOLUN -> optimal is using two pointers and move the lower one L or R