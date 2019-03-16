package design.pattern.factory.pattern.abstractFactoryPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className FactoryBMW523
 * @description TODO
 * @date 2019/2/21 下午5:12
 **/
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }


}
