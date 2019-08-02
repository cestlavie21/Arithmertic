package chapter1;

/**
 * @author kevin
 */
public class BinarySearch {
    /**
     * 二分查找
     * 时间负责度 log(n)
     *
     * @param array
     * @param item
     * @return
     */
    public static Integer binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == item) {
                return item;
            } else {
                if (item < array[mid]) {
                    high = mid - 1;
                }
                if (item > array[mid]) {
                    low = mid + 1;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9, 11, 14, 15, 17};
        Integer res = binarySearch(array, 11);
        System.out.println(res);
    }
}
