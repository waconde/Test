package Algorithm.zhangke.quickSort;

/**
 * @author zhangke
 * @version 1.0
 * @className QuickSort1
 * @description TODO 快速排序算法-左右交换法,查找中轴（最低位作为中轴）所在位置
 * @date 2019/1/22 上午10:49
 **/
public class QuickSort0 {
    /**
     * 递归形式的分治排序算法：
     * @param array
     * @param lo
     * @param hi
     */
    public static void quickSort(int[] array, int lo, int hi) {
        //表示已经完成一个组
        if (lo >= hi) {
            return;
        }
        int index = partition(array, lo, hi);
        quickSort(array, lo, index - 1);
        quickSort(array, index + 1, hi);
    }

    /**
     * 左右交换法
     * @param array
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] array, int left, int right) {
        //int key = array[left];
        int key = mid3(array,left,right);
        while (left < right) {
            while (left < right && key < array[right]) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= key) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;
        return left;
    }
    //上数取中
    public static int mid3(int[] array, int left, int right) {
        int mid=(left+right)/2;
        if (array[right]< array[left] ) {
            swap(array,left, right);
        }
        if (array[right] <array[mid] ) {
            swap(array,left, mid);
        }
        if (array[left]  < array[mid] ) {
            swap(array,left, mid);
        }
        return array[left];
    }
    public static void swap ( int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
