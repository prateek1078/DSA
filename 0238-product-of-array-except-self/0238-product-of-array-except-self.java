class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // set all values 1 in result array
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        int leftProduct = 1;
        int rightProduct = 1;
        
        // Calculate the product to the left of each element and store it in the result array.
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        // Calculate the product to the right of each element and multiply it with the result array.
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}

