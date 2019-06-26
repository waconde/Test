package algorithm.bian.cheng.ti;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author zhangke
 * @version 1.0
 * @className problem
 * @description TODO 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @date 2019/2/25 下午5:36
 **/
public class problem {
    public static void main(String []args){
        System.out.print("请输入字符串：\n");
        Scanner sr1=new Scanner(System.in);
        //键盘接收字符串
        String i1=sr1.nextLine();
        System.out.println(Permutation(i1));
    }
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>() ;
        if(str==null || str.length()==0) { return result ; }
        char[] chars = str.toCharArray() ;
        TreeSet<String> temp = new TreeSet<>() ;
        Permutation(chars, 0, temp);
        result.addAll(temp) ;
        return result ;
    }
    public static void Permutation(char[] chars, int begin, TreeSet<String> result) {
        if(chars==null || chars.length==0 || begin<0 || begin>chars.length-1) { return ; }
        if(begin == chars.length-1) {
            result.add(String.valueOf(chars)) ;
        }else {
            for(int i=begin ; i<=chars.length-1 ; i++) {
                swap(chars, begin, i) ;
                Permutation(chars, begin+1, result);
                swap(chars, begin, i) ;
            }
        }
    }
    public static void swap(char[] x, int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}