package Algorithm.zhangke.BianChengTi;

import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className problem6
 * @description TODO 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
测试样例：This is nowcoder返回：redocwon si sihT。，找出支配者
 * @date 2019/2/25 下午5:28
 **/
public class problem6 {
    public static void main(String []args){
        System.out.print("请输入字符串：\n");
        Scanner sr1=new Scanner(System.in);
        String i1=sr1.nextLine();//键盘接收字符串
        System.out.println("您输入的字符串为：\n"+i1);
        int n=i1.length();
        char[] ch =i1.toCharArray();
        for(int i=0;i<n/2;i++)
        {swap(ch,i,n-1-i);}
        String str1=new String(ch);
        System.out.println("翻转后的字符串：\n"+str1);
    }
    public static void swap(char[] x, int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
//    public static void main(String []args){
//        System.out.print("请输入字符串：\n");
//        Scanner sr1=new Scanner(System.in);
//        String str1=sr1.nextLine();//键盘接收字符串
//        System.out.println("您输入的字符串为：\n"+str1);
//        int n=str1.length();
//        if(n<=1||str1==null)
//            System.out.println("翻转后的字符串：\n"+str1);
//        else{
//            StringBuffer sb=new StringBuffer();
//            for(int i=n-1;i>=0;i--)
//                sb.append(str1.charAt(i));
//            System.out.println("翻转后的字符串：\n"+sb.toString());}
//    }
}