package algorithm.pai.xu.fa.quickSort;

/**
 * @author zhangke
 * @version 1.0
 * @className QuickSort1
 * @description TODO 快速排序算法
 * 快速排序(Quick Sort)是对冒泡排序的一种改进，基本思想是选取一个记录作为枢轴，
 * 经过一趟排序，将整段序列分为两个部分，其中一部分的值都小于枢轴，另一部分都大于枢轴。
 * 然后继续对这两部分继续进行排序，从而使整个序列达到有序。
 * @date 2019/1/22 上午10:49
 **/
public class QuickSortTest {
    public static void main(String[] args) {
//        int len=10;
//        int[] arr1=new int[len];
//        for (int i = 0; i < len; i++) {
//            //让程序随机产生一个1-10000的数
//            //Math.random会随机 产生一个0-1的数
//            int t=(int)(Math.random()*100);
//            arr1[i]=t;
//        }
        // int [] arr1={3,4,3,99,59,30,4,52,60,80};
        int[] arr1 = {3, 4, 7, 2, 5, 6};
        System.out.println("排序前的数为： ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            if (i % 9 == 0 && i != 0) {
                System.out.println(" ");
            }
        }

        long start = System.currentTimeMillis();
        QuickSort1.quickSort(arr1, 0, arr1.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("排序所花的时间为： " + (end - start));
        System.out.println("排序后的数为： ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

    }

}
