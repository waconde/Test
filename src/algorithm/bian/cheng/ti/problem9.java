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
        Boolean[] use=new Boolean[5];
        for (int i = 0; i < use.length; i++) {
            use[i]=true;
        }
        int leftcount=use.length;//数组的长度
        int countnum=0;//计数开始
        int index=0;//指引
        while (leftcount>1) {
            if(use[index]!=false) {
                countnum++;
                if (countnum==3) {
                    countnum=0;
                    use[index]=false;
                    leftcount--;
                }
            }
            index++;
            if (index==use.length) {
                index=0;
            }
        }
        for (int i = 0; i < use.length; i++) {
            System.out.println(i + "=" + use[i] + " ");
        }
    }

}