class Solution {
    public int[] productExceptSelf(int[] nums) {
         int[] right = new int[nums.length];
      int[] left = new int[nums.length];
    //   int[] result = new int[nums.length];
         
         for(int i = 0 ; i < nums.length ; i++){
             
             int endIndex = (nums.length - i) - 1;
      
           
            if(i == 0){
                left[i] = 1;
                
                
            }else{
                left[i] = left[i - 1] * nums[i - 1];
            }
            
            if(endIndex == nums.length - 1){
                right[endIndex] = 1;
                
                
            }else{
                 right[endIndex] = right[endIndex + 1] * nums[endIndex + 1];
            }
            
            
         }
          for(int i = 0 ; i < nums.length ; i++){
             nums[i] = right[i] * left[i];
         }
         
         return nums;
    }
}