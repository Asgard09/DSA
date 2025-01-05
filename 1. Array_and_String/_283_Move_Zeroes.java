public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int j = 0;
        int[] newNums = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                newNums[j] = nums[i];
                j++;
            }
            else{
                countZero++;
            }
        }
        int indexForInsertZero = n - countZero;
        for(int i = indexForInsertZero; i<n; i++){
            newNums[i] = 0;
        }
        for (int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
