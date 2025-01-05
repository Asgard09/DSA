public class Sort_Algorithms {
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }       
        }
        Print(arr.length, arr);
    }

    public static void InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i<n; i++){
            int ai = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>ai){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = ai;

        }
        Print(n, arr);
    }

    public static void SelectionSort(int[] arr){
        int n = arr.length;
        //int minIndex;
        for (int i = 0; i<n; i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(arr[i]!= arr[minIndex]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        Print(n, arr);
    }
    public static void Print(int n, int[] arr){
        for(int i = 0;i<n;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,7,8,1,2};
        //BubbleSort(arr);
        //InsertionSort(arr);
        SelectionSort(arr);
    }
}
