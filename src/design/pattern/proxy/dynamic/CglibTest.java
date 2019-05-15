package design.pattern.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author zhangke
 * @version 1.0
 * @className CglibTest
 * @description TODO
 * @date 2019/2/19 下午9:38
 **/
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyActor.class);
        //Callback要织入的代码
        enhancer.setCallback(cglibProxy);

        IActor iActor = (IActor)enhancer.create();
        iActor.perform(5000,"bale");
        iActor.dangerPerform(100000);
    }
}