package algorithm.pai.xu.fa;

/**
 * @author zhangke
 * @version 1.0
 * @className MaxHeapSortTest
 * @description TODO 最大堆排序
 *堆排序中最重要的算法就是maxHeap，该函数假设一个元素的两个子节点都满足最大堆的性质(左右子树都是最大堆)，
 * 只有根元素可能违反最大堆性质，那么把该元素以及左右子节点的最大元素找出来，如果该元素已经最大，那么整棵
 * 树都是最大堆，程序退出，否则交换跟元素与最大元素的位置，继续调用maxHeap原最大元素所在的子树。
 * @date 2019/2/13 下午7:57
 **/
public class MaxHeapSortTest {
    public static  void main(String [] args){
//        int len=10;
//        int[] arr1=new int[len];
//        for (int i = 0; i < len; i++) {
//            //让程序随机产生一个1-10000的数
//            //Math.random会随机 产生一个0-1的数
//            int t=(int)(Math.random()*100);
//            arr1[i]=t;
//        }
        int [] arr1={3,4,3,99,46,59,30,4,52,80};
        System.out.println("排序前的数为： ");
        for (int i = 0;i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
            if(i%9==0&&i!=0){
                System.out.println(" ");
            }
        }
        long start= System.currentTimeMillis();
        heapSort(arr1);
        long end= System.currentTimeMillis();
        System.out.println("排序所花的时间为： "+(end-start));
        System.out.println("排序后的数为： ");
        for (int i = 0;i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
            if(i%9==0&&i!=0){
                System.out.println(" ");
            }
        }

    }
    public static void heapSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        buildMaxHeap(array);
        //把最大堆变为排序变为最小堆排序，方便输出
        for (int i = array.length - 1; i >= 1; i--) {
            swap(array, 0, i);
            maxHeap(array, i, 0);
        }
    }
    private static void buildMaxHeap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int half = array.length / 2;
        for (int i = half; i >= 0; i--) {
            // 完全二叉树只有数组下标小于或等于 (data.length) / 2 - 1 的元素有孩子结点，遍历这些结点。
            // *比如上面的图中，数组有10个元素， (data.length) / 2 - 1的值为4，a[4]有孩子结点，但a[5]没有*
            maxHeap(array, array.length, i);
        }
    }
    //  从i节点开始调整,heapSize为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2
    private static void maxHeap(int[] array, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        // 这是一个临时变量，表示 跟结点、左结点、右结点中最小的值的结点的下标
        int largest = index;
        // 存在左结点，且左结点的值大于根结点的值  ，heapSize为数组的长度
        if (left < heapSize && array[left] > array[index]) {
            largest = left;
        }
        // 存在右结点，且右结点的值大于以上比较的较大值
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }
        // 左右结点的值都大于根节点，直接return，不做任何操作
        if (index != largest) {
            // 交换根节点和左右结点中最大的那个值，把根节点的值替换下去
            swap(array, index, largest);
            // 由于替换后左右子树会被影响，所以要对受影响的子树再进行heapify
            maxHeap(array, heapSize, largest);
        }
    }
    private static void swap(int[] arrays, int i, int j) {
        int temp;
        temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}