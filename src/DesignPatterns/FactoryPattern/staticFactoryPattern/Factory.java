package DesignPatterns.FactoryPattern.staticFactoryPattern;

/**
 * @author zhangke
 * @version 1.0
 * @className Factory
 * @description TODO
 * @date 2019/2/21 下午5:00
 **/
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
