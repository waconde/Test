package algorithm.pai.xu.fa.quickSort;

/**
 * @author zhangke
 * @version 1.0
 * @className QuickSort1
 * @description TODO
 * @date 2019/1/22 上午10:49
 **/
public class QuickSort1 {
    /**
     * 左右指针法
     * 选取一个关键字(key)作为枢轴，一般取整组记录的第一个数/最后一个，这里采用选取序列最后一个数为枢轴。
     * 设置两个变量left = 0;right = N - 1;
     * 从left一直向后走，直到找到一个大于key的值，right从后至前，直至找到一个小于key的值，然后交换这两个数。
     * 重复第三步，一直往后找，直到left和right相遇，这时将key放置left的位置即可。
     * 当left >= right时，一趟快速排序就完成了，这时将Key和array[left]的值进行一次交换。
     * 关键点：停下来的时候的值left=right的一定小于key
     *
     * @return
     */
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }

}
