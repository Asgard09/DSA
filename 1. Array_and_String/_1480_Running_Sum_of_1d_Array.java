public class _1480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
    
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        for(int i = 1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        return prefixSum;
    }
}
