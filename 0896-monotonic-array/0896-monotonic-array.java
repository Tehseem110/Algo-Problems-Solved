class Solution {
    public boolean isMonotonic(int[] nums) {
        
         int trackNeg = 0;
       int trackPos = 0;
       
       
       
       
       
       
       for(int i = 0;i < nums.length - 1  ; i++){
           if(nums[i] < nums[i + 1]){
               trackNeg++;
           }
            if(nums[i] > nums[i + 1]){
               trackPos++;
           }
       }
      
       
      if(trackNeg == 0 || trackPos == 0 ){
        
          return true;
      }else{
         
          return false;
      }
    }
}