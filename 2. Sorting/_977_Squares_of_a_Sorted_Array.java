public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums){
        
        int[] newArrays = new int[nums.length];
        int square = 0;
        int right = nums.length-1;
        int left = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            
            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                square = nums[right];
                right--;
            }

            else{
                square = nums[left];
                left++;
            }
            newArrays[i] = square*square;
        }

        return newArrays;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
