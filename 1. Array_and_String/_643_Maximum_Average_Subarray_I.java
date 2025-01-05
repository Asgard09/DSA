public class _643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int n = nums.length;
        for(int i =0; i<k;i++){
            currentSum+=nums[i];
        }

        int maxSum = currentSum;

        for(int i = k; i<n;i++){
            currentSum += nums[i];
            currentSum -= nums[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double)maxSum/k;
    }
}
