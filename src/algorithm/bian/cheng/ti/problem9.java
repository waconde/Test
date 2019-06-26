package algorithm.bian.cheng.ti;

/**
 * @author zhangke
 * @version 1.0
 * @className problem9
 * @description TODO //约瑟环问题，丢人到大海。
 * @date 2019/2/25 下午5:35
 **/
public class problem9 {
    public static void main(String []args){
        //定义一个数组，数组的长度表示环的总人数，注意从0开始
        Boolean[] use=new Boolean[5];
        for (int i = 0; i < use.length; i++) {
            use[i]=true;
        }
        //数组当前剩余未出列的人数
        int leftCount=use.length;
        //计数开始的编号
        int countNum=0;
        //指引
        int index=0;
        //剩余人数为 0 退出，如果需要知道最后一个一个退出的是谁，只需要leftCount>1
        while (leftCount>0) {
            //如果当前人未退出，则加1
            if(use[index]!=false) {
                countNum++;
                //数的到要退的人，改值为 false，同时把剩余人数减 1，计数标志置位0
                if (countNum==3) {
                    countNum=0;
                    use[index]=false;
                    System.out.println("当前出列的人是"+index);
                    leftCount--;
                }
            }
            index++;
            //如果到数字的尾部，则返回头部
            if (index==use.length) {
                index=0;
            }
        }
        for (int i = 0; i < use.length; i++) {
            System.out.println(i + "=" + use[i] + " ");
        }
    }

}