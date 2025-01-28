public class MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE+1];
    private int size;

    MyHeap(){
        size = 0;
    }

    public boolean isEmpty(){
        return size<=0;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }
        return arr[0];
    }

    public void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public void add(int value){
        size++;
        arr[size] = value;
        int currentIndex = size;
        int parentIndex = currentIndex/2;
        
        while (parentIndex != 0 && arr[currentIndex] <= arr[parentIndex]) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = currentIndex/2;
        }
    }

    public static void main(String[] args) {
        
    }
}