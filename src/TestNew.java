/**
 * @author zhangke
 * @version 1.0
 * @className TestNew
 * @description TODO
 * @date 2019/2/28 下午9:51
 **/
public class TestNew {
    static int a = 3;
    static int b;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    static {
        System.out.println("static block initialized");
        b = a*4;
    }
    public static void main(String[] args) {
        TestNew.meth(42);
    }
}
