package design.pattern.proxy.statics;

/**
 * @author zhangke
 * @version 1.0
 * @className RealManager
 * @description TODO 真实对象
 * @date 2019/2/20 上午11:28
 **/
public class RealManager implements Manager {

    @Override
    public void run() {
        System.out.println("RealRun");
    }
}