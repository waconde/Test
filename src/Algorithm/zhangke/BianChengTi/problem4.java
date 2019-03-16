package Algorithm.zhangke.BianChengTi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className problem4
 * @description TODO 输入一串单词 输出其中重复的单词
 * @date 2019/2/25 下午5:28
 **/
public class problem4 {

    public static void main ( String[] args )
    {
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String next = null;
        System.out.println ("输入多个单词，空格分开: ");
        while (scanner.hasNextLine ())
        {
            next = " " + scanner.nextLine () + " ";
            System.out.println ("您输入的单词为"+next);
            String[] array = next.split ("\\s+");
            for ( String string : array ){
                String str = " " + string + " ";
                if (!"".equals (string) && next.indexOf (str) != next.lastIndexOf (str)){
                    list.add (string);
                }
            }
            if (list.size () > 0){
                System.out.println ("重复的单词是：" + list.toString ().replaceAll ("\\[|\\]", "").replaceAll (",\\s+", " "));
            }else{
                System.out.println ("没有重复的");
            }
        }
    }
}