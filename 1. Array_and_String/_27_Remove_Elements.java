public class _27_Remove_Elements {
    public static int removeElement(int[] nums, int val) {
        int newSize = 0; // Biến để theo dõi số phần tử duy nhất
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newSize] = nums[i]; // Di chuyển phần tử vào vị trí mới
                newSize++; // Tăng kích thước mảng duy nhất
            }
        }
        return newSize;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 1, 2, 2, 3, 0, 4, 2};
        int value = 2;
        System.out.println(removeElement(a1, value));
        System.out.println("Done");
        for (int i : a1) {
            System.out.println(i);
        }
    }
}