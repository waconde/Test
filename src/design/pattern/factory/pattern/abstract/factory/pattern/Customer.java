package design.pattern.factory.pattern.abstractFactoryPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Customer
 * @description TODO
 * @date 2019/2/21 下午5:13
 **/
public class Customer {
    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
