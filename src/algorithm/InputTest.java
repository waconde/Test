package algorithm;

import java.util.Scanner;

/**
 * @author zhangke
 * @version 1.0
 * @className InputTest
 * @description TODO 标准的输入与输出
 * @date 2019/1/21 下午10:00
 **/
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        //字符串中可以输入空格
        String name = in.nextLine();

        System.out.print("What is your name1? ");
        //字符串中不可以输入空格
        String name1 = in.next();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();
        System.out.print("How old are you? ");
        float age1 = in.nextFloat();

        // display output on console
        System.out.println("name " + name+"name1 " + name1 + "age" +age+"age1" +age1 );
    }
}