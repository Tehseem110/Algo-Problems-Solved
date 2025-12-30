class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       boolean isExist = false;
       for(int i:nums){
           System.out.println(i);
           if(map.containsKey(i)){
               isExist = true;
               break;
           }else{
             map.put(i,1);
           }
          
       }
       return isExist; 
    }
}