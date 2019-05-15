package design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangke
 * @version 1.0
 * @className MyInvocationHandler
 * @description TODO jdk的动态代理
 * @date 2019/2/19 下午8:46
 **/
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    MyInvocationHandler() {
        super();
    }
    //构造器的形式注入代理对象
    MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *
     * @param o 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return 方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if ("perform".equals(method.getName())) {
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        } else {
            Object result = method.invoke(target, args);
            return result;
        }
    }

}