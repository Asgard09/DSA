public class _74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lengthOfCol = matrix[0].length;
        int lenghtOfRow = matrix.length;

        for (int indexOfRow = 0; indexOfRow < lenghtOfRow; indexOfRow++) {
            if (matrix[indexOfRow][lengthOfCol - 1] >= target) {
                int temp = BinarySearch(0, lengthOfCol, matrix[indexOfRow], target);
                if (temp == -1) continue;
                if (matrix[indexOfRow][temp] == target ) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int BinarySearch(int left, int right, int[] nums, int target){
        int mid = 0;
        while(left<=right){
            mid = (right+left)/2;
            
            if (nums[mid] == target) {
                return mid;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}}; 
        int target = 10;
        System.out.println(searchMatrix(matrix, target));
    }
}
