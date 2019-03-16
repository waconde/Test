package design.pattern.proxy.pattern.staticProxy;

/**
 * @author zhangke
 * @version 1.0
 * @className RealManager
 * @description TODO
 * @date 2019/2/20 上午11:28
 **/
public class RealManager implements Manager {

    @Override
    public void run() {
        System.out.println("RealRun");
    }
}