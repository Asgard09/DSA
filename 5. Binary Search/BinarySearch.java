/*
 * Search techniques in a sorted array
 * Divide and Conquer Algorithm
 */

 public class BinarySearch {
 
    public static int binarySearch(int[] a, int key){
        int n = a.length;
        int left = 0;
        int right = n-1;

        while (left<=right) 
        {
            int mid = (left + right)/2;
            if (key == a[mid]) {
                return mid;
            }else if(key>a[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a= {-1,0,3,5,9,12};
        System.out.println(binarySearch(a, 9));
    }
 }