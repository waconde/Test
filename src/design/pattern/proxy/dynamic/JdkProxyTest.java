package design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangke
 * @version 1.0
 * @className JdkProxyTest
 * @description TODO  所谓代理，就是不改变原有类代码的基础上，对其方法进行增强。
 * 这里以演员举例对其进行说明。演员有出演角色的行为，他们能演戏，但他们都会与经纪公司签约，
 * 而剧组找人都是找经纪公司，向公司提供一个标准。这个过程中，演员就是原生类，经纪公司就好
 * 比是在做代理这件事。经纪公司给他们公司的演员对外宣称，低于10000的戏不演，这就是在对演
 * 员的动作进行增强。代码如下：
 * @date 2019/2/19 下午8:31
 **/
public class JdkProxyTest {
    public static void main(String[] args) {
        //jdk动态代理是jdk原生就支持的一种代理方式，它的实现原理，就是通过让target类和代理类实现同一接口，
        // 代理类持有target对象，来达到方法拦截的作用，这样通过接口的方式有两个弊端，一个是必须保证target类有接口，
        // 第二个是如果想要对target类的方法进行代理拦截，那么就要保证这些方法都要在接口中声明，实现上略微有点限制。
        IActor iActor = new MyActor();
        InvocationHandler invocationHandler = new MyInvocationHandler(iActor);
        //代理类持有target对象的引用
        IActor myActorProxy = (IActor)Proxy.newProxyInstance(iActor.getClass().getClassLoader(),
                iActor.getClass().getInterfaces(), invocationHandler);
        myActorProxy.perform(5000,"bale");
        //myActorProxy.dangerPerform(100000);

    }
}