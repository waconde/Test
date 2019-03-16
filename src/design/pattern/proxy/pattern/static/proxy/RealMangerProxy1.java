package design.pattern.proxy.pattern.staticProxy;

/**
 * @author zhangke
 * @version 1.0
 * @className RealMangerProxy1
 * @description TODO 代理类继承被代理类
 * @date 2019/2/20 上午11:37
 **/
public class RealMangerProxy1 extends RealManager{


    @Override
    public void run() {
        System.out.println("extends:realManager操作开始");
        super.run();
        System.out.println("extends:realManager操作结束");

    }
}