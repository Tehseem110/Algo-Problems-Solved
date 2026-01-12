class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int i = m - 1;  // pionter of nums1
     int j = n - 1;  // pointer of nums2
     int k = nums1.length - 1;  // index to save value to 
     
     while( j >= 0){
         if(i >= 0 && nums1[i] > nums2[j]){
             nums1[k] = nums1[i];
             nums1[i] = 0;
             i--;
         }else{
             nums1[k] = nums2[j];
             j--;
         }
    
         k--;
       
      
     }
    }
}