package design.pattern.proxy.dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangke
 * @version 1.0
 * @className CglibProxy
 * @description TODO
 * @date 2019/2/19 下午9:31
 **/
public class CglibProxy implements MethodInterceptor {

    /**
     *
     * @param obj 代理对像
     * @param method 拦截的方法
     * @param args 方法的参数
     * @param methodProxy 代理类
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");
        System.out.println(method.getName());
        Object o1 = methodProxy.invokeSuper(obj, args);
        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");
        return o1;
    }

}