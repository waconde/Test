package design.pattern.proxy.statics;

/**
 * @author zhangke
 * @version 1.0
 * @className Manager
 * @description TODO 代理接口，被代理对象所实现的接口如果新增一个方法，则需要在
 * 代理类中再写一遍代理的过程。但是动态代理不需要
 * @date 2019/2/20 上午11:26
 **/
public interface Manager {
    void run();
}