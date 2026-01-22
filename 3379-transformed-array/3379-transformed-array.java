class Solution {
    public int[] constructTransformedArray(int[] nums) {
          int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                int indexToGo = ((i + nums[i]) % n + n) % n;
                result[i] = nums[indexToGo];
                System.out.println("i=" + i + " → index=" + indexToGo);
            }
        }
        return result;
    }
}