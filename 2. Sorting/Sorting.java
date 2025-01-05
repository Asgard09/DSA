

public class Sorting {
    
    /*
    * Chạy từ đầu đến cuối mảng 
    * Nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ
    * Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới
    */
    public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

    /*
     * Chạy từ đầu đến cuối mảng 
     * Tại vòng lặp i, coi như dãy từ [0, i-1] đã được sắp xếp, chèn a[i] vào vị trí thích hợp 
     * Sau vòng lặp thứ i thì dãy [0, i] đã được sắp xếp
     */
    public static void insertionSort(int[] a){
        for (int i = 1; i < a.length-1; i++) {
            int ai = a[i];
            int j = i-1;
            while (j>=0 && a[j]>a[i]) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] =ai;
        }
    }


    /*
     * Chạy từ đầu đến cuối mảng 
     * Tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1, n-1], nếu nhỏ hơn a[i] thì đổi chỗ cho a[i].
     * Sau vòng lặp thứ i, thì dãy [0,i] đã được sắp xếp
     */
    public static void selectionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        }
    }
}
