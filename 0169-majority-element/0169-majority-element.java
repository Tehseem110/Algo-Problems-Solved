class Solution {
    public int majorityElement(int[] nums) {
           int mostOccuringElement = 0;
      int mostOccuringElementCount= 0;
      
      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i = 0 ; i < nums.length ; i++){
          
         
          
          if(map.containsKey(nums[i])){
             map.put(nums[i],map.get(nums[i]) + 1);
              
          }else{
               map.put(nums[i],1) ;
          }
         
          if(map.get(nums[i]) > mostOccuringElementCount ){
              mostOccuringElementCount = map.get(nums[i]);
              mostOccuringElement = nums[i];
              
          }
           if(mostOccuringElementCount > nums.length / 2 ){
              break;
          }
          
          
      }
      return mostOccuringElement;
    }
}