class Solution {
    public void moveZeroes(int[] nums) {
       
        
        int j= 0;
        
        //for-each loop to store non zero values at start of array
        for(int num: nums){
            if (num!= 0){
                nums[j++]= num;
            }
            
        }
        
        //now fill the remaining values with 0
       while(j < nums.length){
           nums[j]=0;
           j++;
       }
        
    }
}