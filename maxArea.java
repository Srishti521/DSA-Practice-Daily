class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height-1;
        int  maxArea =0;
        
        while(left < right){
            //compute area
             int area = Math.min(height[left], height[right]) * (right-left);
            //Update 
            maxArea = Math.max(maxArea , area);
        
        // moving the pointer pointing to the shorter line
           if(height[left] < height[right]){
            left++;
            } else {
              right--;
            }
        }
        return maxArea;
    }
}