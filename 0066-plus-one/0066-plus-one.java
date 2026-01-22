class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length - 1;
      
      while(j >= 0){
          System.out.println(digits[j]);
          if(digits[j] == 9){
              digits[j] = 0;
              j--;
          }else{
              digits[j]++;
              return digits;
            
          }
        
      }

      int[] result = new int[digits.length + 1];
      result[0] = 1;
      return result;

     
    }
}