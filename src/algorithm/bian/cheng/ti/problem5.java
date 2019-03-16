package algorithm.bian.cheng.ti;

import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className problem5
 * @description TODO 5把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @date 2019/2/25 下午5:28
 **/
public class problem5 {
    public static void main(String []args){
        System.out.print("请输入第1位侯选人的名字：\n");
        Scanner sr1=new Scanner(System.in);
        String i1=sr1.nextLine();//键盘接收字符串
        int nums[] = new int[i1.length()];  //声明数组
        for(int i=0;i<i1.length();i++){
            nums[i] = Integer.parseInt(i1.substring(i, i+1));
        }
        System.out.println(minNumberInRotateArray(nums));

    }
    public static int  minNumberInRotateArray(int[]array) {
        if (array==null||array.length<=0)
            return 0;
        if (array.length==1)
            return array[0];

        for (int i = 0; i < array.length; i++) {
            if( array[i]>array[i+1])
                return array[i+1];
        }
        return array[0];

    }
}