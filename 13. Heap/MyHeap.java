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

    public static void main(String[] args) {
        
    }
}