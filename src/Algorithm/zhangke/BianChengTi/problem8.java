package Algorithm.zhangke.BianChengTi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className problem8
 * @description TODO
 * @date 2019/2/25 下午5:34
 **/

/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
 测试样例：
 "This is nowcoder","is This nowcoder"
 返回：true
 "Here you are","Are you here"
 返回：false
 */
public class problem8 {
    public static void main(String []args){
        System.out.print("请输入字符串：\n");
        Scanner sr1=new Scanner(System.in);
        String str1=sr1.nextLine();//键盘接收字符串
        System.out.print("请输入字符串：\n");
        Scanner sr2=new Scanner(System.in);
        String str2=sr1.nextLine();//键盘接收字符串
        System.out.println(checkSam(str1, str2));

    }
    public static boolean checkSam(String stringA, String stringB) {

        char[] c1 = stringA.toCharArray();
        char[] c2 = stringB.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);   //注意使用Arrays.equals(c1, c2)而不是c1.equals(c2):如果两个数组以相同顺序包含相同的元素，则两个数组是相等的
    }
}