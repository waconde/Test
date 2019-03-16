package algorithm.bian.cheng.ti;

import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className problem1
 * @description TODO
 * @date 2019/2/25 下午5:27
 **/
public class problem1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();//字符串中可以输入空格

        System.out.print("What is your name1? ");
        String name1 = in.next();//字符串中不可以输入空格

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();
        System.out.print("How old are you? ");
        float age1 = in.nextFloat();

        // display output on console
        System.out.println("name " + name+"name1 " + name1 + "age" +age+"age1" +age1 );
    }
}