class Solution {
    public int majorityElement(int[] nums) {
       
       
            int count = 0;
       int currentLeader = 0;
       
       for(int n: nums){
          if(count == 0){
              count = 1;
              currentLeader = n;
              
          }else if(currentLeader == n){
              count++;
          }else{
              count--;
          }
          
       }
      
       return currentLeader;

    }
}