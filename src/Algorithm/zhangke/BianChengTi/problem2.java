package Algorithm.zhangke.BianChengTi;

import java.util.Arrays;

/**
 * @author zhangke
 * @version 1.0
 * @className problem2
 * @description TODO 一个数组的支配者为在数组中出现的概率大于数组个数的一半，找出支配者
 * @date 2019/2/25 下午5:28
 **/
public class problem2 {
    public static void main(String []args){
        int []ints={3,3,2,3,3,4,5,4,3};
        int j=Judge(ints);
        if(j==-1){
            System.out.print("没有");
        }else {
            System.out.println("有"+ints[j]);
        }
    }
    private static int Judge(int[] ints) {
        // TODO 自动生成的方法存根
        Arrays.sort(ints);
        int counter=1;
        for (int i= 0; i+1 < ints.length; i++) {
            if(ints[i]==ints[i+1]){
                counter++;
                if (2*counter>ints.length) {
                    return i;
                }
            }else {
                counter= 1;
            }
        }
        return -1;
    }

}