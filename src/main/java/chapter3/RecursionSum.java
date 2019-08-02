package chapter3;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author kevin
 * 递归方法： 基线条件 + 递归条件
 * 确定基线条件后，让不断递归从而接近基线条件
 */
public class RecursionSum {

    /**
     * 使用递归方式实现数组所有元素的和
     *
     * @param array
     * @return
     */
    public static Integer recursionSum(Integer[] array) {

        //基线条件
        if (array.length < 0) {
            return 0;
        }
        //基线条件
        if (array.length == 1) {
            return array[0];
        }
        //递归条件
        int res = array[0] + recursionSum(ArrayUtils.remove(array, 0));
        return res;
    }

    /**
     * 使用递归的方式找到数组中最大值
     *
     * @param array
     * @return
     */
    public static Integer findMaxByRecursion(Integer[] array) {
        //基线条件
        if (array.length == 2) {
            return array[0] >= array[1] ? array[0] : array[1];
        }
        //递归条件
        return array[0] >= array[1] ? findMaxByRecursion(ArrayUtils.remove(array, 1)) : findMaxByRecursion(ArrayUtils.remove(array, 0));
    }

    public static void main(String[] args) {

        Integer[] array = {1, 3, 2, 7, 9, 11, 30, 14, 15, 90, 17};

//       Integer sum = recursionSum(array);
//       System.out.println(sum);
        Integer res = findMaxByRecursion(array);
        System.out.println(res);

    }
}
