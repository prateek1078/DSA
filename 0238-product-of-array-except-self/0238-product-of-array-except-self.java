class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // set all values 1 in result array
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        int product = 1;
        
        for( int i =0 ; i<n ;i++){
            
            product *= nums[i];
            result[i] = product;
            
        }
        
        product =1;
        
        for (int i = n-1; i>0; i--){
            result[i] = result[i-1]*product;
            product*= nums[i];
        }
        
        result[0] = product; 
        
        return result;
    }
}

