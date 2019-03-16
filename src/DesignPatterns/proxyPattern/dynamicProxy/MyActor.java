package DesignPatterns.proxyPattern.dynamicProxy;

/**
 * @author zhangke
 * @version 1.0
 * @className MyActor
 * @description TODO 被代理类target
 * @date 2019/2/19 下午8:30
 **/

public class MyActor implements IActor {
    @Override
    public void perform(int money,String name) {
        System.out.println("拿到" + money + "钱，执行一般表演");
    }

    @Override
    public void dangerPerform(int money) {
        System.out.println("拿到" + money + "钱，执行特殊表演");
    }
}
