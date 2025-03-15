public class _74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int colLength = matrix.length;
        int rowLength = matrix[0].length;
        

        for(int col = 0; col< colLength; col++){
            if(target >= matrix[col][0] && target <= matrix[col][rowLength -1] ){
                return binarySearch(matrix[col], target);
            }else{
                continue;
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left<=right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                return true;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}}; 
        int target = 1;
        System.out.println(searchMatrix(matrix, target));
    }
}
