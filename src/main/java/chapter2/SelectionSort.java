package chapter2;

import java.util.Arrays;

/**
 * @author kevin
 */
public class SelectionSort {

    /**
     * 选择排序
     * 时间复杂度：O(n^2)
     *
     * @param array
     */
    public static void selectionSort(Integer[] array) {
        Integer temp = null;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] array = {1, 3, 2, 7, 9, 11, 30, 14, 15, 90, 17};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

}