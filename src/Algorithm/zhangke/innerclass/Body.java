package Algorithm.zhangke.innerclass;

/**
 * @author zhangke
 * @version 1.0
 * @className Body
 * @description TODO 内部类的种类：成员内部类、静态内部类、局部内部类、匿名内部类
 * @date 2019/3/9 下午4:38
 **/
/*
 * 成员内部类
 */
public class Body {
    String arm;
    String leg;
    String blood;
    public Body(String arm, String leg, String blood) {
        super();
        this.arm = arm;
        this.leg = leg;
        this.blood = blood;
    }
    //内部类Heart
    /**
     作为外部类的一个成员存在，与外部类的属性、方法并列
     成员内部类持有外部类的引用
     成员内部类中不能定义static变量和方法
     **/
    class Heart{
        String name;
        void work() {
            System.out.println("心脏正在给"+arm+leg+"输"+blood);
        }
    };
    public static void main(String[] args) {
        Body body=new Body("两个胳膊","两条腿","血");
        Body.Heart  heart=body.new Heart();
        heart.work();
    }
}