package design.pattern.factory.pattern.factory.method.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className FactoryBMW523
 * @description TODO 创建工厂类2
 * @date 2019/2/21 下午5:05
 **/
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
