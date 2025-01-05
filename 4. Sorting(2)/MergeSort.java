public class MergeSort {
    private static void mergeSort(int[] inputArray) {

        //Divide
        int inputLength = inputArray.length;
        
        if (inputLength < 2) {
          return;
        }
        
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        
        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
          rightHalf[i - midIndex] = inputArray[i];
        }
        
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        //Merge
        merge(inputArray, leftHalf, rightHalf);
    }
    
    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        /*
         * i: Represent the current index in the leftHalf array
         * j: Represent the current index in the rightHalf array
         * k: Represent the current index in the inputArray
         */
        int i = 0, j = 0, k = 0;

        
        while (i < leftSize && j < rightSize) {
          if (leftHalf[i] <= rightHalf[j]) {
            inputArray[k] = leftHalf[i];
            i++;
          }
          else {
            inputArray[k] = rightHalf[j];
            j++;
          }
          k++;
        }
        
        //handle the case where one of the arrays (leftHalf or rightHalf) still has remaining elements after the main merge loop
        while (i < leftSize) {
          inputArray[k] = leftHalf[i];
          i++;
          k++;
        }
        
        while (j < rightSize) {
          inputArray[k] = rightHalf[j];
          j++;
          k++;
        }
        
    }
    
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38,27,43,3,9,82,10};
        mergeSort(arr);
        printArray(arr);
    }

}