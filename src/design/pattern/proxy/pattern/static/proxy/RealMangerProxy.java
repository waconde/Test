package design.pattern.proxy.pattern.staticProxy;

/**
 * @author zhangke
 * @version 1.0
 * @className RealMangerProxy
 * @description TODO 代理类和被代理类实现同一个接口
 * @date 2019/2/20 上午11:29
 **/
public class RealMangerProxy implements Manager {
    private  RealManager realManager;

    public RealMangerProxy(RealManager realManager) {
        super();
        this.realManager = realManager;
    }

    @Override
    public void run() {
        System.out.println("implements:realManager操作开始");
        realManager.run();
        System.out.println("implements:realManager操作结束");

    }
}