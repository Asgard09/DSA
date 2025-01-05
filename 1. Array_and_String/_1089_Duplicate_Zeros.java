public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {

        int n = arr.length;
        int zeros = 0;

        for (int i : arr) {
            if (i==0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        while (i>= 0) {
            if (j<n) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j-=1;
                if (j<n) {
                    arr[j] = 0;
                }
            }

            i-=1;
            j-=1;
        }
        
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        print(arr);
    }
}
