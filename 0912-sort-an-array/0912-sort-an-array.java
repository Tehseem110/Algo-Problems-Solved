class Solution {
    public int[] sortArray(int[] nums) {

        mergeSort(nums);
        return nums;
       
    }

    


    public static void mergeSort(int[] arr){
        int length = arr.length;
        int middle =  arr.length / 2;

        if(length <= 1) return;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // track left array
        int j = 0; // track right array

        for(; i < length;i++){
            if(i < middle){
                leftArray[i] = arr[i];

            }else{
                rightArray[j] = arr[i];
                j++;

            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,arr);





    }


   private static void merge(int[] leftArray,int[] rightArray,int[] arr){
         int leftLength = arr.length / 2;
         int rightLength = arr.length - leftLength;

         int i = 0 , l = 0 , r = 0 ;

         while(l < leftLength && r < rightLength){
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            }else{
                arr[i] = rightArray[r];
                r++;
                i++;
            }
         }

         while(l < leftLength){
            arr[i] = leftArray[l];
            i++;
            l++;
         }

           while(r < rightLength){
            arr[i] = rightArray[r];
            i++;
            r++;
         }








   }   
}