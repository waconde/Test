package Exception.zhangke;

/**
 * @author zhangke
 * @version 1.0
 * @className Demo1
 * @description TODO
 * @date 2019/1/14 下午4:21
 **/
public class Demo1 {

    public static void main(String[] args) {
        try {
            //出现异常的运算条件时
            int i = 10/0;
            System.out.println("i="+i);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
        finally {
            System.out.println("run finally");
        }
    }
}