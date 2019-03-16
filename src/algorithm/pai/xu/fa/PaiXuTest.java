package algorithm.pai.xu.fa;

import java.util.Calendar;

/**
 * @author zhangke
 * @version 1.0
 * @className PaiXuTest
 * @description TODO
 * @date 2019/1/21 下午10:04
 **/
public class PaiXuTest {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        int len=100000;
        int[] arr1=new int[len];
        for (int i = 0; i < len; i++) {
            //让程序随机产生一个1-10000的数
            //Math.random会随机 产生一个0-1的数
            int t=(int)(Math.random()*10000);
            arr1[i]=t;

        }
		System.out.print("排序前的数为： ");
		for (int i = 0; i < arr1.length; i++){
        	System.out.print(arr1[i]+" ");
        }
        //冒泡排序法
        // Bubble bubble =new Bubble();
        //创建一个Select类，选择排序法
        // Select select =new Select();
        //InsertSort is =new InsertSort();
        QuickSort qs=new QuickSort();
        //在排序前打印系统时间
        Calendar cal=Calendar.getInstance();
        System.out.println("排序前"+cal.getTime());
        // bubble.sort(arr1);
        // select.sort(arr1);
        //  is.sort(arr1);
        qs.sort(0, arr1.length-1, arr1);

        //重新获取时间实例
        cal=Calendar.getInstance();
        System.out.println("排序后"+cal.getTime());
     /* System.out.print("排序后的数为 ");
       for (int i = 0; i < arr1.length; i++){
        	System.out.print(arr1[i]+" ");
        }*/
    }

}
class Bubble{

    //冒泡排序方法
    public void sort(int arr[])
    {
        int temp=0;
        //冒泡排序
        //外层循环，它决定一共走了几趟
        for (int i = 0; i < arr.length; i++) {
            //内衬循环开始逐个比较，如果发现前一个数比后一个数大，则交换
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    //换位
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
}

class Select
{
    /**
     * 选择排序法：比如在一个长度为N的无序数组中，在第一趟遍历N个数据，
     * 找出其中最小的数值与第一个元素交换，第二趟遍历剩下的N-1个数据，
     * 找出其中最小的数值与第二个元素交换......第N-1趟遍历剩下的2个数据，
     * 找出其中最小的数值与第N-1个元素交换，至此选择排序完成。
     * @param arr
     */
    public void sort(int arr[])
    {
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            int min =arr[i];
            //记录最小数的下标
            int minIndex=i;
            for (int k =i+1; k < arr.length; k++)
            {
                if(min>arr[k])
                {//修改最小数
                    min=arr[k];
                    minIndex=k;
                }
            }
            //当退出for就找到这次的最小值
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
//插入式排序法
class InsertSort
{
    //插入式排序法
    public void sort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            //准备要去插入序列的数
            int insertVal = arr[i];
            int index=i-1;
            //要插入的数和前一个数比较
            while (index>=0&&insertVal<arr[index]) {
                //将arr[index]向后移动
                arr[index+1]=arr[index];
                //让index向前移动
                index--;
            }
            //将insertVal插入适当位置
            arr[index+1]=insertVal;
        }
    }
}
//快速排序法
class QuickSort{

    public void sort(int left,int right,int []array){
        int l=left;
        int r=right;
        int pivot=array[(left+right)/2];
        int temp=0;
        while(l<r){
            while(array[l]<pivot)l++;
            while(array[r]>pivot)r--;
            if(l>=r)break;
            temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            if(array[l]==pivot)--r;
            if(array[r]==pivot)++l;
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r) sort(left,r,array);
        if(right>l) sort(l,right,array);
    }
}