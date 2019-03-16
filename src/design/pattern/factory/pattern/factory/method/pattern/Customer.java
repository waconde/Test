package design.pattern.factory.pattern.factory.method.pattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Customer
 * @description TODO 客户类：
 * @date 2019/2/21 下午5:05
 **/
public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
