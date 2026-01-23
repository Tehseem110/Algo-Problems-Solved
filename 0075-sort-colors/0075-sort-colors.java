class Solution {
    public void sortColors(int[] nums) {
        HashMap<String, Integer> colorsMap = new HashMap<>();
       colorsMap.put("red",0);
       colorsMap.put("white",0);
       colorsMap.put("blue",0);
       
       /// update the array based on hashmap values
       for(int i = 0; i < nums.length;i++){
           if(nums[i] == 0){
               int value = colorsMap.get("red") + 1;
               colorsMap.put("red",value);
           }
            if(nums[i] == 1){
               int value = colorsMap.get("white") + 1;
               colorsMap.put("white",value);
           }
            if(nums[i] == 2){
                int value = colorsMap.get("blue") + 1;
               colorsMap.put("blue",value);
           }
       }
      // rebuild array
        int index = 0;

        int redCount = colorsMap.get("red");
        for (int i = 0; i < redCount; i++) {
            nums[index++] = 0;
        }

        int whiteCount = colorsMap.get("white");
        for (int i = 0; i < whiteCount; i++) {
            nums[index++] = 1;
        }

        int blueCount = colorsMap.get("blue");
        for (int i = 0; i < blueCount; i++) {
            nums[index++] = 2;
        }  
    }
}