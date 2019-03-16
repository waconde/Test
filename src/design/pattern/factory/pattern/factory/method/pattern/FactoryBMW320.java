package design.pattern.factory.pattern.factory.method.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className FactoryBMW320
 * @description TODO 创建工厂类1
 * @date 2019/2/21 下午5:05
 **/
public class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
