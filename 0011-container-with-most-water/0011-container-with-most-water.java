class Solution {
    public int maxArea(int[] height) {
        
        //initialising
        
        int left=0;
        int right= height.length - 1;
        int maxArea=0;
        
        
        // here basic idea is to find area to find max water that can be contained
        
        while(left< right){
            int minHeight= Math.min(height[left], height[right]); //min height bcz water can only be filled till the lower wall
            int width= right- left;
            int area= minHeight*width;
            maxArea = Math.max(maxArea, area);
            
            if(height[left]<height[right]){
                left++; 
            }else{
                right--;
            }
            
        }
        
        return maxArea;
    }
}