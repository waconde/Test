package DesignPatterns.FactoryPattern.staticFactoryPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Customer
 * @description TODO
 * @date 2019/2/21 下午5:01
 **/
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
